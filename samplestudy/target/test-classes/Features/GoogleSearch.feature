Feature: feature to test google search results
@smoketest
  Scenario: validate google search functionality
    Given Browser is open
    When User is on the google search page
    Then Search results should be ready

