Feature: Login

  Scenario: Login Data Driven  using Map
    Given User Launch  the required  browser
    When User opens the  URL
    And User enters the valid credentials username  and password
      | username            | password |
      | admin@yourstore.com | admin    |
    When Click on Login button 
    Then Navigated to home page
    And close the  browser
