Feature: Test the Cucumber page
  Test if cucumber works in a Java framework

  Scenario: Test#1. Testing cucumber
    Given user goes to fake website
    And user enters the following info
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |

  Scenario Outline: Test#2<id>. Testing scenario outline
    Given user goes to website "<url>"

    Examples:
      | id | url                      |
      | 1  | http://www.google.com    |
      | 2  | http://www.microsoft.com |
      | 3  | http://www.spacex.com    |

  Scenario: Test#3. Test argument transformation in step definition
    Given user goes to fake website
    And user enter the email address as "thomas_ejob"
