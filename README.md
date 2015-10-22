### About
Opinionated Gradle getting started template as a good starting point for any project. 
The focus here on the simplicity, and the use of code quality and static analysis tools:
- JaCoCo - for test coverage
- Checkstyle - for standardize and control the style between members in the team
- PMD/FindBugs - to spot any potential bug places and establish best practices
- Spock Framework - as the flexible testing for framework for Java project

The versions of the tools used in this template see below in the table.

Read more about [Gradle 'Getting Started' template](http://akazlou.com/posts/2015-07-19-gradle-getting-started-template.html)

### How to use it

#### Via script (recommended)
 - download and put `gradleGettingStarted.groovy` script into bin folder
 - run `gradleGettingStarted.groovy` or `gradleGettingStarted.groovy <project name>`
 - provide the project name script asks for (if run without project name specified)
 - add your remote location `git remote add origin <your remote location>`

#### Manually
 - clone the repository `git clone https://github.com/zshamrock/gradle-getting-started-template.git <your project name>`
 - unlink remote `git remote rm origin`
 - add your remote location `git remote add origin <your remote location>`
 - add all files into Git `git add .`
 - commit your changes `git commit -m "Getting started"`
 - push your changes into the remote repository `git push -u origin master`

### Tools versions
<table>
    <tr>
        <th>Gradle</th>
        <th>Groovy</th>
        <th>Java</th>
        <th>PMD</th>
        <th>Checkstyle</th>
        <th>FindBugs</th>
        <th>JDepend</th>
        <th>JaCoCo</th>
    </tr>
    <tr>
        <td>2.8 (released 20th October 2015)</td>
        <td>2.4.5 (released 7th September 2015)</td>
        <td>1.8</td>
        <td>5.4.0 (released 4th October 2015)</td>
        <td>6.11.2 (released 5th October 2015)</td>
        <td>3.0.1 (release 6th March 2015)</td>
        <td>2.9.1 (released 22nd August 2008)</td>
        <td>0.7.5.201505241946 (released 24th May 2015)</td>
    </tr>
</table>

### License
The MIT License (MIT)

Copyright (c) 2015 Aliaksandr Kazlou

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
