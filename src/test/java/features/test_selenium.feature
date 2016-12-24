Feature: Testing Selenium with page objects

  Scenario: [Test#4] Testing Selenium
    Given user goes to default url
    When  user logins as "username" and "password"
    When  user sets the firstname to be "thomas" for the home page
    And   user sets the middlename to be "quang" for the home page
