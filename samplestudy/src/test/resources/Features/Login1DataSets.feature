Feature: Test the login functionality

  Scenario Outline: Verify the login with valid credentials
    Given Launch the browser
    When User entered the valid <username> and <password>
    Then user navigated to the home page

    Examples: 
      | Grm  | 12345 | 
      | Stephen | 12345 | 
      
