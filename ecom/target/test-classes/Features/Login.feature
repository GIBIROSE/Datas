Feature: Login

  Scenario: Verify the login with valid credentials
    Given user launch chrome browser
    When user opens the url
    And user enters email id and password
    And Click on login button
    Then Navigated to the home page
    When user click on the Logout link
    Then page title should be other
    And closes the browser
