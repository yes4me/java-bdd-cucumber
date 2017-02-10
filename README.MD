# UI BDD Automated Test Framework

## Preface
---

* Purpose: End-to-End tests for UI testing on Windows
* Author: Thomas Nguyen
* Date started: 2016/12/13

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
8. [Lexicon](#Lexicon)
9. [Sources](#Sources)

## Introduction
---

Hello,

Thank you for having a look at my BDD framework written in Java.
You can download the latest code at my [repository](https://github.com/yes4me/java-bdd-cucumber).
I made an overview [video](https://youtu.be/4RS0p3MdfIo) about this project.
Feel free to comment. Nobody can improve without feedback. Thank you in advance. 

Sincerely,

Thomas Nguyen, thomas.ejob@gmail.com
https://www.linkedin.com/in/thomasquang
Personal projects code: https://github.com/yes4me

## Prerequisites
---

* Windows 8.1

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
    * cucumber-junit: to run JUnit tests on cucumber
    * cucumber-TestNG: to run TestNG tests on cucumber
    * selenium-java: to run the browser
    * junit: to run JUnit tests on the browser
    * TestNG: to run TestNG tests on the browser
    * jxl: for Excel library
    * mysql-connector-java: connect to MySQL
3. Optional Dependencies:
    * log4j-core and log4j-api: to generate log files

## Setup
---

1. Java SDK
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

1. Run Java code: src\main\java\com\thomas\HelloWorld.java
2. Run src\test\java\features\test_cucumber.feature from IntelliJ
3. Run src\test\java\features\test_cucumber8.feature from IntelliJ
4. Run src\test\java\features\Test_selenium.java from IntelliJ (JAVA file)
5. Run src\test\java\features\test_selenium.feature from IntelliJ

## Uninstall
---

* Uninstall IntelliJ
* delete the source folder

## Known bugs
---

To do:

* close browser after test

Error messages:

* Load error: undefined path variables. MAVEN_REPOSITORY is undefined => You opened the project using WebStorm instead of IntelliJ 

## Other notes
---

Shortcuts for Intellij IDEA:

1. General
    * CTRL + / = comment
2. Features:
    * Alt + Return = create step definition for the selected feature
    * CTRL + left click = Read the corresponding step definition
    * CTRL + Alt + L = fix indentations
3. Classes:
    * ALT + Insert = auto generate codes (ex: constructor)

src/main/resources/log4g2.xml for saving the log into a file named after the current time:

```
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
<Properties>
    <Property name="logPath">logs</Property>
</Properties>
<Appenders>
    <Console name="Console" target="SYSTEM_OUT">
        <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
    </Console>
    <RollingFile name="fileLogger" fileName="${logPath}/myLog.log" filePattern="${logPath}/myLog.log">
        <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        <Policies>
            <OnStartupTriggeringPolicy/>
        </Policies>
    </RollingFile>
</Appenders>
<Loggers>
    <Root level="trace">
        <AppenderRef ref="Console"/>
        <AppenderRef ref="fileLogger"/>
    </Root>
</Loggers>
</Configuration>
```

## Lexicon
---

**Acronym**

* BDD = Behavior-Driven Development = same as TDD, and also aims to make the test syntax readable by anyone (using Cucumber)
* TDD = Test-Driven Development = tests to validate expected behavior
* UAT = User Acceptance Testing
* Data Driven Testing: using data sources (ex: XML, Excel sheets, Database Tables)
* OOP = Object Oriented Programming
* Procedural Programming = divided into small parts called functions
* SQL = Structured Query Language
* TestNG: testing framework inspired from JUnit and NUnit, with new more powerful functionalities

**Project Methodology**

* Scrum Master: organize meetings, dealing with blockers, and ensure the product backlog is ready for the next sprint
* Waterfall:
    * One big Structured project => clearly defined requirements upfront
    * A sequential process
    * Suited for situations where change is uncommon
* Agile:
    * Many small flexible projects with continuous improvements
    * Involves many parties => Highly collaborative
    * A process in which requirements are expected to evolve and change

**HTTP**

* GET request: 
    * remain in the browser history, can be bookmarked
    * GET requests should never be used when dealing with sensitive data
    * GET requests have length restrictions
    * GET requests should be used only to retrieve data
* POST request:
    * do NOT remain in the browser history, never bookmarked/cached
    * POST requests have no restrictions on data length
* Status Code Definitions:
    * 2xx Success: ok(200)
    * 3xx redirection: Moved Permanently(301), Found(302)
    * 4xx Client Error: Bad Request(400, cannot update Jira tickets), Forbidden(402), Not found(404)
    * 5xx Server Error: Web server catch-all error(500)

**QA tests**

* black box test = software testing method in which the internal structure/design/implementation of the item being tested is NOT known to the tester
* white box test = software testing method in which the internal structure/design/implementation of the item being tested is known to the tester
* load test = test to check the behaviour of the system under a specific expected load (= nb of concurent users)
* stress test = test to check the behaviour of the system under an extreme load (= unexpected nb of concurent users)
* unit test = white box testing of the smallest testable part done individually (testing just that component) and independently (testing without any other part)
* smoke test: initial/preliminary set of tests to check whether the major functionalities are working correctly and to check the major breakdowns in the application
* regression test: to make sure that the updated code does not break the application and that the previous, and new business requirements are met  
* split testing: a way of comparing multiple versions of a web page to find out which one converts visitors best
* test double: white box testing where an object or component is installed in place of the real component for the express purpose of running a test (i.e. mock, spies)
* test suite: collection of test cases intended to test a behavior or a set of behaviors of software program

**Flow graph**

* control flow graph: visual representation of all paths that might be traversed through a program during its execution
* node: represents the information contained in a single structure (code inside a block of code)
* edge: the connection between nodes
* statement coverage (= line coverage): white box technique to test execution of all statements => must pass by all nodes
* branch coverage (= decision coverage): white box technique to test each possible decision (ex: if (i>0 && j>0) requires 1 test)
* path coverage: white box technique to test EVERY single combination of possible decisions (ex: if (i>0 && j>0) requires 2 tests)
* cyclomatic complexity (= quantitative measure of the number of linearly independent paths through a program's source code): draw the control flow graph => number of decisions/regions + 1

**BDD framework**

* API: only the parts of a library that are exposed to the programmer
* framework: pre-written collection of libraries/classes with the common goal of providing a scaffold on which to build software
* library: collection of functions/objects that serves one particular purpose and can be used in a variety of projects
* platform: hardware/software upon which a piece of software is built on or target (ex: Java)
* cucumber: popular tool to help write BDD (automated tests) and for the purpose of documentation 
* JUnit and TestNG: testing framework for java applications
* selenium grid: distribute tests on multiple machines, to test on different platforms using the same text script. It reduces the time of test execution and provides quick feedback
* gherkin: language specification for Cucumber
* selenese: language to write test script in Selenium IDE

* hard assertion: throws an exception immediately when an assert statement fails => assert 
* soft assertion: customized error handler provided by TestNG => verify
* absolute XPath expression start by /
* relative XPath expression start by // - Example: By.xpath("//select[@id='category']/option[@id='cat2']")
* implicit wait: Tell WebDriver the latency that you wait BEFORE checking for ANY element to present:
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
* explicit wait: Tell WebDriver the MAX latency that you CHECK if a PARTICULAR element is not present: 
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
* glue: map the features to step definitions
* PageFactory Class : 
    * extension to the Page Object design pattern. It is used to initialize the elements of the Page Object or instantiate the Page Objects itself
    * ex: PageFactory.initElements(DriverContext.getDriver(), page);

**OOP Pillar Family**

* abstraction => child "extends" ONE abstract class
    * the class must have 1+ abstract method (must be implemented)
    * the class cannot be instantiated => the class must be inherited (CONCEPT: Inheritance)
    * the class cannot have an access modifiers(i.e. public, private)
* interface: "contract" where all methods are implicitly public (and abstract by default) => child can "implement" multiple interfaces
* marker: interface with no method (i.e. Serializable)
* "functional" interface: interface with ONLY ONE method
* encapsulation: building classes such that direct access to the object data is prohibited (= data hiding)
    * using access modifiers (ex: public, private, etc...)
    * using accessor and mutator (= getter and setter)
* inheritance: use extends
* polymorphism: ability of an object to take on many forms. Examples: list(arrayList, LinkedList) and Shape => refers to dynamic method dispatching

**Java/coding definitions**

* Java versions: Entreprise Edition (EE) > Standard Edition (SE) > Micro Edition (ME)

* Java Development Kit (JDK): JRE + Developer tools
* Java compiler: transforms the source code into bytecode (which is then interpreted by the JVM) 
* Java Runtime Environment (JRE)
    * only run Java
    * = Java API and JVM
* Java Virtual Machine (JVM): platform dependent software to allow your Java, Groovy, Clure, Scala, etc... to run on the specific platform

* stacks: small memory, to hold the primitive values, pointers to the objects, main(String[] arg)
* heap: large memory for objects

* scope: refers to the section of code where a variable can be accessed => curly brackets, access modifiers
* (method) access modifiers:
    * private: accessible only within the same class => private contructor restricts the instantiation of a class => Singlton pattern
    * default: accessible to everyone in the same package
    * protected: accessible to everyone in the same package, or through inheritance (only the object which extends can access)
    * public: accessible to everyone
* static:
    * static variable or method: can be accessed without requiring an instantiation of the class to which it belongs
    * ONLY class variables can be declared as static
    * When calling a class, static variable are accessed first, THEN the non static variables are accessed
    * import static: Then you can invoke the method directly like it was declare inside the class 

* reference variable: variable defined OF a class (ex: Person p)
* instantiation variable: variable that creates an object using the "new" keyword
* instance variable: NON-static variable defined IN a class object (= class variable = static variable)
* local variable:
    * defined inside methods, constructors or blocks (!= instance variable)
    * do NOT have a default value, and cannot be static
* final variable: variable that cannot change and must be defined right away or in the constructor (ex: String)

* annotation: syntactic metadata that can be added to Java source code. Classes, methods, variables, parameters and packages may be annotated
* default constructor: is defined only when there is NO constructor
* queue: collection of elements, which can be stored and retrieved one at a time, First-In-First-Out (FIFO)
* stack: collection of elements, which can be stored and retrieved one at a time, Last-In-First-Out (LIFO)
* synchronized blocks: can only have one thread executing inside them at the same time
* final method: method cannot be overridden
* lambda expression: provides a way to represent one method interface using an expression. It works only with interface
* closure: function types and inline function-valued expression

* garbage collection: Memory Management that reclaims memory for reuse => System.gc(); to request for clean up
* package:
    * grouping of related types (classes, interfaces, enumerations and annotations) providing access protection and namespace management
    * to prevent naming conflicts, to control access, to make searching and usage of classes, interfaces, enumerations and annotations easier.
* try-with-resources: try (Connetion conn = DriverManager.getConnection(...)) {...} will close conn even if there is an exception
* space complexity: describes how much (extra)space would be required by the algorithm with change in the input size (= nb values changed needed to perform the change)
* time complexity: describes how much time algorithm consumes based on the length of the input (= nb of times in the loops)

**Others**

* reference 'by value': When an object is passed as argument to a method, actually the reference to that object is passed
* web service: service offered by an electronic device to another electronic device via the internet in XML or JSON format


## Sources
---

* Download:

    * [git](https://git-scm.com/)
    * [Java Development Kit (JDK)/Java SE](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
    * [Official Selenium HQ Drivers](http://www.seleniumhq.org/download/)
    * [Maven repository](https://mvnrepository.com/)
    * [TestNG](http://TestNG.org/doc/download.html)

* References:

    * [Apache Log4j configuration](https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm)
    * [Code coverage introduction](http://testersthoughtsuncombed.blogspot.com/2013/02/statement-coverage-vs-branch-coverage.html)
    * [Code coverage](https://sites.google.com/site/swtestingconcepts/home/test-design-techniques/for-white-box/statement-branch-and-path-coverage)
    * [Java](https://www.tutorialspoint.com/java/java_regular_expressions.htm)
    * [Java: access modifier](http://www.codejava.net/java-core/the-java-language/java-access-modifiers-examples-public-protected-private-and-default)
    * [Java: closure](http://bruceeckel.github.io/2015/10/17/are-java-8-lambdas-closures/)
    * [Java: File Organization](https://web.archive.org/web/20130516014426/http://www.oracle.com/technetwork/java/codeconventions-141855.html#1852)
    * [Java: Garbage collector](https://dzone.com/articles/java-garbage-collector-and-reference-objects)
    * [Java: Generics](https://docs.oracle.com/javase/tutorial/java/generics/types.html)
    * [Java: Lambda](http://stackoverflow.com/questions/23834995/lambda-expressions-for-interface-with-multiple-methods)
    * [Java: overriding vs overloading](http://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/)
    * [Java: reflection](https://www.mkyong.com/java/how-to-use-reflection-to-call-java-method-at-runtime/)
    * [Java: tool CSV](http://www.programcreek.com/java-api-examples/index.php?api=org.apache.commons.csv.CSVRecord)
    * [Java: tool MySQL](http://www.javatpoint.com/java-jdbc)
    * [Java: tool XLS](http://executeautomation.com/blog/data-driven-testing-in-selenium-using-jxl-part-1.2/)
    * [Java: type List](http://stackoverflow.com/questions/18410035/ways-to-iterate-over-a-list-in-java)
    * [Java: type Map](http://stackoverflow.com/questions/41309387/difference-in-declaring-a-map)
    * [QA: entry exit](http://sqa.stackexchange.com/questions/18803/what-are-the-entry-and-exit-criteria-in-performance-testing/18805)
    * [QA: test double](https://www.javacodegeeks.com/2015/11/test-doubles-mocks-dummies-and-stubs.html)
    * [QA: XPath](https://www.bennadel.com/blog/2142-using-and-expressions-in-xpath-xml-search-directives-in-coldfusion.htm)
    * [Selenium explicit vs implicit wait](http://toolsqa.com/selenium-webdriver/implicit-explicit-n-fluent-wait/)
    * [Selenium pagefactory](http://toolsqa.com/selenium-webdriver/page-object-pattern-model-page-factory/)
    * [Selenium wait](http://docs.seleniumhq.org/docs/04_webdriver_advanced.jsp#explicit-and-implicit-waits)
    * [TestNG Annotation](https://www.tutorialspoint.com/TestNG/TestNG_basic_annotations.htm)
    * [TestNG Assertion](http://pgorantla.blogspot.com/2014/04/top-20-useful-commands-in-selenium.html)
    * [TestNG configuration](http://sahajamit.github.io/Cucumber-JVM-with-TestNG/)
    * [Project methodology: Waterfall vs Agile](http://www.onedesk.com/waterfall-vs-agile/)
    * [Project methodology: Waterfall vs Agile](http://www.agilistapm.com/differences-between-waterfall-iterative-waterfall-scrum-and-lean-software-development-in-pictures/)
    * [Project methodology: Agile scrum vs Agile Kanban](https://www.smartsheet.com/agile-vs-scrum-vs-waterfall-vs-kanban)

* Inspirational codes:

    * [Cucumber Reporting](https://github.com/damianszczepanik/cucumber-reporting)
    * [Java: Automation framework with Selenium (Basic)](https://www.udemy.com/cucumber-with-selenium/learn/v4/overview)
    * [Java: Automation framework with Selenium (Advanced)](https://www.udemy.com/automation-framework-with-selenium/learn/v4/content)
    * [Repository of Mr Karthik KK](https://github.com/executeautomation?tab=repositories)

* Others:

    * [Java SE 8 API Documentation](https://docs.oracle.com/javase/8/docs/api/)
    * [QA interview questions](http://qaquestions.net/)
    * [Regex](https://regex101.com/)
