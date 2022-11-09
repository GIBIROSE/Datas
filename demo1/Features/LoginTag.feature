@FunctionalTest
Feature: Free NOP ecommerce  application testing

  @smoke
  Scenario: Login with correct username and correct password
    Given This is a valid login test

  @regression
  Scenario: Login with incorrect username and correct password
    Given This is a invalid login test
