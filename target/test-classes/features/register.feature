  Feature: Register


    Scenario: User should register
      Given User makes request for registration with valid information
      Then User receives response and verify register with status code 204