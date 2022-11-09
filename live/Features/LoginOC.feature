Feature: Login opencart application

  Scenario: Login Data Driven  using Map
    Given User Launch  the required  browser
    When User opens the  URL
    And User enters the valid credentials username  and password
      | username | password |
      | demo     | demo     |
    When Click on Login button
    Then Navigated to home page
    And close the  browser

  Scenario: Home page navigation
    Given close the important security information
    Then user can view dashboard
    When user click on the sales button
    Then user click on the sales orders subtab
    And user can view existing order details
    Then user can add new orders
    And user click on the add item tab
    Then user can choose product
    And user can choose options
    Then user can save add item
    And close the add item tab
