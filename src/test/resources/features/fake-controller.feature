Feature: Fake Controller Test - Dirty Context annotation behavior

  Scenario: Calling fake endpoint twice in the same scenario should have the final count as two
    Given I call the fake endpoint
    Then The call count should be 1
    Given I call the fake endpoint
    Then The call count should be 2

  Scenario: Calling fake endpoint again should reset the count and return 1
    Given I call the fake endpoint
    Then The call count should be 1