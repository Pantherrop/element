Feature: Login Functionality

  Scenario: User can log in with valid credentials
    Given the user is on the login page
    When they enter "Ankit2345" into the username field
    And they enter "Andi12345" into the password field
    And they click the login button
    Then they should be successfully logged in

  Scenario: User cannot log in with an invalid username
    Given the user is on the login page
    When they enter an invalid username into the username field
    And they enter "Andi12345" into the password field
    And they click the login button
    Then they should see an error message indicating invalid credentials

  Scenario: User cannot log in with an invalid password
    Given the user is on the login page
    When they enter "Ankit2345" into the username field
    And they enter an invalid password into the password field
    And they click the login button
    Then they should see an error message indicating invalid credentials

  Scenario: User cannot log in with an empty username
    Given the user is on the login page
    When they leave the username field empty
    And they enter "Andi12345" into the password field
    And they click the login button
    Then they should see an error message indicating that the username is required

  Scenario: User cannot log in with an empty password
    Given the user is on the login page
    When they enter "Ankit2345" into the username field
    And they leave the password field empty
    And they click the login button
    Then they should see an error message indicating that the password is required

  Scenario: User cannot log in with a password that is too short
    Given the user is on the login page
    When they enter "Ankit2345" into the username field
    And they enter a password that is too short into the password field
    And they click the login button
    Then they should see an error message indicating that the password is too short

  Scenario: User gets locked out after multiple failed login attempts
    Given the user is on the login page
    When they enter an incorrect username and password multiple times
    And they exceed the maximum login attempts
    Then they should see an error message indicating their account is locked
