Feature: Login feature of the opencart demo application


  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://demo.opencart.com/admin/"
    And User enters Email as "demo" and Password as "demo"
    And Click on Login
    Then Page Title should be opencartdemo
    And User should close the browser
