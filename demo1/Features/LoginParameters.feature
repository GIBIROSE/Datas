Feature: Login

  Scenario: Verify the login with valid credentials
    Given user launched browser
    When user opens the url as "http://admin-demo.nopcommerce.com/"
    And user enters email id  as "admin@yourstore.com" and password as "admin"
    Then Click on the login button
    And closes the browser