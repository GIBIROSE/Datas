Feature: Customers

  Scenario: Add new customer
    Given user launch chrome browser
    When user opens url
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user view home page
    When user click on customers menu
    And click on customers menu item
    And click on add new button
    Then user can view add new customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer added successfully"
    And close the browser
