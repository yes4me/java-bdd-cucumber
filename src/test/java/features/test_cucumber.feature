Feature: Test the Cucumber page
  Test if cucumber works in a Java framework
  If this doesn't work, edit the configuration, and glue to "step_definitions"

  Scenario: [Test#1] Testing cucumber
    Given user goes to fake url "http://www.githubs.com"
    And user enters the following info
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |
    And user enters the email address as "thomas_ejob"
