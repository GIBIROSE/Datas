Feature: Login

  Scenario: Login Data Driven  data table
    Given User Launch  the Chrome browser
    When User opens URL
    And User enters the valid credentials emaiid and pwd
      | admin@yourstore.com | admin |
    When Click on Login button
    And close browser
