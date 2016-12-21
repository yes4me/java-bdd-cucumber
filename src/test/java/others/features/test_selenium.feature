Feature: Testing Selenium with page objects

  Scenario: [Test#5] Testing Selenium
    Given user goes to url "http://www.google.com"
    When  user sets the "search" to be "cat" on the "google" page
    And   user clicks on "search" on the "google" page
