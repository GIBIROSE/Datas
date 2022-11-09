Feature: Login

  Scenario: Verify the login with valid credentials
    Given user launch chrome browser
    When user opens the url as "http://admin-demo.nopcommerce.com/"
    And user enters email id  as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then Navigated to the home page
    When user click on the Logout link
    Then page title should be other
    And closes the browser

  Scenario Outline: Login Data Driven
    Given user launch chrome browser
    When user opens the url as "http://admin-demo.nopcommerce.com/"
    And user enters email id  as "<email>" and password as "<password>"
    And Click on login button
    Then Navigated to the home page
    When user click on the Logout link
    Then page title should be other
    And closes the browser

    Examples: 
      | email                | password |
      | admin@yourstore.com  | admin    |
      | admin1@yourstore.com | admin123 |
