#!/usr/bin/env groovy
import java.nio.file.Paths
import java.nio.file.Files
import java.util.concurrent.TimeUnit
import groovy.transform.Field

Process.metaClass.log {
    delegate.in.newReader().eachLine { line ->
        println line
    }
}

@Field
def projectName

def gettingStarted(args) {
    projectName = readProjectName args
    gitClone()
    dropNonProjectFiles()
    gitInit()
}

def readProjectName(args) {
    if (args.length > 0) {
        projectName = args[0]
    } else {
        def console = System.console()
        if (console) {
            projectName = console.readLine('Project name: ')
        } else {
            println 'Console is not available'
        }
    }
}

def gitClone() {
    def gitCmd = "git clone https://github.com/zshamrock/gradle-getting-started-template.git ${projectName}"
    def proc = gitCmd.execute()
    proc.log()
}

def dropNonProjectFiles() {
    def drop = ['.git', 'README.md']
    drop.each { 
        def path = Paths.get(projectName, it)
        if (Files.isDirectory(path)) {
            path.deleteDir()
        } else {
            Files.delete(path)
        }
    }
}

def gitInit() {
    def execDir = new File(projectName)
    def gitCommands = [['init'], ['add', '.'], ['commit', '-m', 'Gradle getting started']]
    gitCommands.each { command -> 
        owner.proc = ['git', *command].execute(null, execDir)
        owner.proc.log()
        owner.proc.waitFor(10, TimeUnit.SECONDS)
    }
}

gettingStarted(args)
