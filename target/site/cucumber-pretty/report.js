$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test_cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Cucumber page",
  "description": "Test if cucumber works in a Java framework\r\nIf this doesn\u0027t work, edit the configuration, and glue to \"step_definitions\"",
  "id": "test-the-cucumber-page",
  "keyword": "Feature"
});
formatter.uri("test_cucumber8.feature");
formatter.feature({
  "line": 1,
  "name": "Test the Cucumber page with Java1.8",
  "description": "Testing lambda expression",
  "id": "test-the-cucumber-page-with-java1.8",
  "keyword": "Feature"
});
formatter.uri("test_selenium.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Selenium with page objects",
  "description": "",
  "id": "testing-selenium-with-page-objects",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9743165362,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "[Test#5] Testing Selenium",
  "description": "",
  "id": "testing-selenium-with-page-objects;[test#5]-testing-selenium",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user goes to url \"http://www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user sets the \"search\" to be \"cat\" on the \"google\" page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \"search\" on the \"google\" page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 18
    }
  ],
  "location": "Common_steps.java:22"
});
formatter.result({
  "duration": 2901325973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 15
    },
    {
      "val": "cat",
      "offset": 30
    },
    {
      "val": "google",
      "offset": 43
    }
  ],
  "location": "Common_steps.java:25"
});
formatter.result({
  "duration": 254885401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    },
    {
      "val": "google",
      "offset": 32
    }
  ],
  "location": "Common_steps.java:29"
});
formatter.result({
  "duration": 172115090,
  "status": "passed"
});
formatter.after({
  "duration": 15551211,
  "status": "passed"
});
});