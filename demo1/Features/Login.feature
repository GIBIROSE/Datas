Feature: Login of the nopcommerce application
# just entered scenario without entering UN and PWD


  Scenario: Verify the login with valid credentials
    Given user launch chrome browser
    When user opens the url
    And user enters valid credentials
    Then Click on login button
    And closes the browser
