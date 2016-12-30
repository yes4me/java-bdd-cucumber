$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test_cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Cucumber page",
  "description": "Test if cucumber works in a Java framework\r\nIf this doesn\u0027t work, edit the configuration, and glue to \"step_definitions\"",
  "id": "test-the-cucumber-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "[Test#1.1] Testing cucumber (Java)",
  "description": "",
  "id": "test-the-cucumber-page;[test#1.1]-testing-cucumber-(java)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user tests classic expression (using \"Java\")",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the following info (classic way)",
  "rows": [
    {
      "cells": [
        "username",
        "thomas"
      ],
      "line": 8
    },
    {
      "cells": [
        "password",
        "nguyen"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the email address as \"thomas_ejob\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "[Test#1.2] Testing cucumber (Java)",
  "description": "",
  "id": "test-the-cucumber-page;[test#1.2]-testing-cucumber-(java)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user tests classic expression (using \"Java\")",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("test_cucumber8.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Cucumber page with Java1.8",
  "description": "Testing lambda expression",
  "id": "test-the-cucumber-page-with-java1.8",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "[Test#2.1] Testing lambda expression (Java8)",
  "description": "",
  "id": "test-the-cucumber-page-with-java1.8;[test#2.1]-testing-lambda-expression-(java8)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user tests lambda expression (using \"Java8\")",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the following info (lambda way)",
  "rows": [
    {
      "cells": [
        "username",
        "thomas"
      ],
      "line": 7
    },
    {
      "cells": [
        "password",
        "nguyen"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "[Test#2.2] Testing lambda expression (Java8)",
  "description": "",
  "id": "test-the-cucumber-page-with-java1.8;[test#2.2]-testing-lambda-expression-(java8)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user tests lambda expression (using \"Java8\")",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("test_selenium.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Selenium with page objects",
  "description": "",
  "id": "testing-selenium-with-page-objects",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "[Test#4] Testing Selenium",
  "description": "",
  "id": "testing-selenium-with-page-objects;[test#4]-testing-selenium",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user goes to default url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user logins as \"username\" and \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify this is the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user sets the firstname to be \"thomas\" for the home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user sets the middlename to be \"quang\" for the home page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});