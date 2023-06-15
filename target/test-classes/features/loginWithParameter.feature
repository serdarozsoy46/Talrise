Feature:  Login With Parameter

  Scenario: user should login with parameter

    Given user makes request to login with "serdar_ozsoy@msn.com" and "Test123456!"
    Then Verify login with status code 200