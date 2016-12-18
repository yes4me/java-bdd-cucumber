# UI BDD Automated Test Framework

## Preface
---

* Purpose: End-to-End tests for UI testing on Windows
* Author: Thomas Nguyen, thomas_ejob@hotmail.com
* Date started: 2016/12/13
* Last update: 2016/12/14

## Table of contents
---

This document will show you how to:

0. [Introduction](#Introduction)
1. [Prerequisites](#Prerequisites)
2. [Overview of packages](#Overview-of-packages)
3. [Setup](#Setup)
4. [Running the program](#Running-the-program)
5. [Uninstall](#Uninstall)
6. [Known bugs](#Known-bugs)
7. [Other notes](#Other-notes)
8. [Definitions](#Definitions)
9. [Sources](#Sources)

## Introduction
---

Feel free to let me know ways to improve the code.
Thank you in advance. 

Thomas Nguyen, thomas_ejob@hotmail.com
https://www.linkedin.com/in/thomasquang

## Prerequisites
---

* Windows 8.1
* Java Development Kit (JDK)
* (optional) Integrated Development Environment(IDE): JetBrains IntelliJ IDEA 15.0

## Overview of packages (defined in pom.xml)
---

1. Plugins: do not trigger any compilation
    * maven-compiler-plugin: to compile the sources of the project
    * maven-surefire-plugin: to generate reports in txt and xml formats
    * cucumber-reporting: to generate reports in pretty graphics
2. Dependencies: JAR files added to the classpath while compiling
    * cucumber-java: to run Cucumber
    * cucumber-java8: to use lambda expression, which simplify writing code  
    * cucumber-picocontainer: to inject code into Cucumber step definitions
    * selenium-java: to run the browser
    * junit: to run JUnit tests on the browser
    * cucumber-junit: to run JUnit tests on cucumber
    * testng: to run TestNG tests on the browser
    * cucumber-testng: to run TestNG tests on cucumber

## Setup
---

1. install Java SDK
    * install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
    * Search for "Edit the System Environment Variables"":
        * System Variables/JAVA_HOME **is** "C:\Program Files\Java\jdk1.8.0_45"
        * System Variables/PATH **contains** "%JAVA_HOME%\bin"
    * Console command: `java -version`
    * Result: Display on the console 'java version "1.8.0_45"'
2. install Intellij IDEA
    * Plugins: Cucumber for Java
    * Build, Execution, Deployment > Compiler > Java Compiler: Target bytecode version = 1.8
3. get the source code
    * install the package: git
    * `git clone <url>`
4. Download and install the [Binary zip archive](https://maven.apache.org/download.cgi) of maven apache
    * Search for "Edit the System Environment Variables"":
        * System Variables/MAVEN_HOME **is** "C:\Program Files\apache-maven-3.3.9"
        * System Variables/PATH **contains** "%MAVEN_HOME%\bin"
    * Console command: `mvn -version`
    * Result: Display on the console 'Apache Maven 3.3.9 ...'

## Running the program
---

1. Run Java code
    * Go to: src\main\java\com\thomas\Main.java
    * Run 'Main' (SHIFT F10)
    * Result: Hello world
2. Run src\test\java\features\test_cucumber.feature from IntelliJ
3. Run src\test\java\features\test_cucumber8.feature from IntelliJ
4. Run src\test\java\features\test_selenium.feature from IntelliJ
5. Console command: start.bat

## Uninstall
---

* Uninstall IntelliJ
* delete the source folder

## Known bugs
---

To do:
* DefaultPage.java & BasePage.java
* close browser after test
* Take all the good codes from my other Java projects and include in this project 

## Other notes
---

Folders:
* my_notes: some notes to help installing
* src/main: Hello world!
* src/test: source files (features, step definitions, page objects, etc...)
* target: library needed to run, output
* vendor: Selenium webdrivers

Shortcuts for Intellij IDEA:

1. General
    * CTRL + / = comment
2. Features:
    * Alt + Return = create step definition for the selected feature
    * CTRL + left click = Read the corresponding step definition
    * CTRL + Alt + L = fix indentations
3. Classes:
    * ALT + Insert = auto generate codes (ex: constructor)

## Definitions
---

QA general definitions:
* BDD = Behavior-Driven Development = tests to validate expected behavior (the test syntax can be read by anyone)
* TDD = Test-Driven Development = API tests to test each unit of code
* Unit Test = white box testing
* black box test = software testing method in which the internal structure/ design/ implementation of the item being tested is NOT known to the tester
* white box test = software testing method in which the internal structure/ design/ implementation of the item being tested is known to the tester
* Gherkin = format for cucumber specification for the purpose of documentation and automated tests
* Cucumber = popular tool to help write BDD

Specific definitions to this framework:
* glue = map the features to step definitions
* step argument transformation ~ environment variable

## Sources
---

* Download:

    * [git](https://git-scm.com/)
    * [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
    * [Official Selenium HQ Drivers](http://www.seleniumhq.org/download/)
    * [Maven repository](https://mvnrepository.com/)

* Tutorials:

    * [Cucumber with Selenium Java](https://www.udemy.com/cucumber-with-selenium/learn/v4/overview)
    * [Tutorial in Java](https://www.tutorialspoint.com/java/java_regular_expressions.htm)

* Inspirational codes:

    * [Repository of Mr Karthik KK](https://github.com/executeautomation?tab=repositories)

* Others:

    * [Regex](https://regex101.com/)
    * [Cucumber Reporting](https://github.com/damianszczepanik/cucumber-reporting)