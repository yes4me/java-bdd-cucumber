# UI BDD Automated Test Framework

## Preface
---

* Purpose: End-to-End tests for UI testing on Windows
* Author: Thomas Nguyen
* Date started: 2016/12/13
* Last update: 2016/12/14

## Table of contents
---

This document will show you how to:

0. [Prerequisites](#Prerequisites)
1. [Overview of packages](#Overview-of-packages)
2. [Setup](#Setup)
3. [Running the program](#Running-the-program)
4. [Uninstall](#Uninstall)
5. [Known bugs](#Known-bugs)
6. [Other notes](#Other-notes)
7. [Definitions](#Definitions)
8. [Sources](#Sources)

## Prerequisites
---

* Windows 8.1
* Java Development Kit (JDK)
* Integrated Development Environment(IDE): JetBrains IntelliJ IDEA 15.0

## Overview of packages (defined in pom.xml)
---

* cucumber-java: to run Cucumber
* cucumber-java8: to use lambda expression, which simplify writing code  
* cucumber-picocontainer: to inject code into Cucumber step definitions
* selenium-java: to run tests on the browser

## Setup
---

1. install Java SDK
    * install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
    * Console command: `java -version`
    * Result: Display on the console 'java version "1.8.0_45"'
    * Search for "Edit the System Environment Variables"":
        * System Variables/JAVA_HOME **is** "C:\Program Files\Java\jdk1.8.0_45"
        * System Variables/PATH **contains** "%JAVA_HOME%\bin"
2. install Intellij IDEA
    * Plugins: Cucumber for Java
    * Build, Execution, Deployment > Compiler > Java Compiler: Target bytecode version = 1.8
3. get the source code
    * install the package: git
    * `git clone <url>`

## Running the program
---

1. Run Java code
    * Go to: src\main\java\com\thomas\Main.java
    * Run 'Main' (SHIFT F10)
    * Result: Hello world
2. Run src\test\java\features\test_cucumber.feature
3. Run src\test\java\features\test_cucumber8.feature
4. Run src\test\java\features\test_selenium.feature

## Uninstall
---

* Uninstall IntelliJ
* delete the source folder

## Known bugs
---

## Other notes
---

Shortcuts for Intellij IDEA:
* General
    * CTRL + / = comment
* Features:
    * Alt + Return = create step definition for the selected feature
    * CTRL + left click = Read the corresponding step definition
    * CTRL + Alt + L = fix indentations
* Classes:
    * ALT + Insert = auto generate codes (ex: constructor)

To do:
* run the code from the command line using testRunner with RunWith attribute
* Gradle > Maven

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

    * [Cucumber with Selenium Java (Basic)](https://www.udemy.com/cucumber-with-selenium/learn/v4/overview)
    * [Tutorial in Java](https://www.tutorialspoint.com/java/java_regular_expressions.htm)

* Inspirational codes:

    * [Repository of Mr Karthik KK](https://github.com/executeautomation?tab=repositories)

* Others:

    * [Regex](https://regex101.com/)
