Feature: Go Rest Feature
  Background: Create a user
    Given creating a user

  @smoke
  Scenario: Verify that a user resource to be updated
    When updating the user
    Then the user is updated

  @regression
  Scenario: Verify that a user resource not to be updated
    When updating the user with invalid input "<username>" and <password>"
    Then the user not to be updated
