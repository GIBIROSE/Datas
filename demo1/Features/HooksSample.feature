Feature: Login of the nopcommerce application

  Scenario: User is on the client creation page
    Given user clicked on the add new client
    When user entered necessary details
    Then user clicked on save button

  Scenario: User is on the payslip creation page
    Given user clicked on the add new payslip
    When user entered necessary details for payslip
    Then user clicked on  the payslip save button
