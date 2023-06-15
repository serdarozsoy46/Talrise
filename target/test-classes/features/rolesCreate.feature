Feature: Create Roles

  Scenario: User should create partner role

    Given user makes request to create "partner" with authorization
    Then verify the status code 201