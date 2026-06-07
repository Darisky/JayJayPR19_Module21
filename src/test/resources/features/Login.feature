@Login
Feature: Login
  @valid-credential
  Scenario: Login With Valid Credential
    Given user at login page
    And user input username and password with "standard_user" and "secret_sauce"
    When user click login button
    And user redirect to home page
    Then user see product list

  @Negative_Test
  Scenario Outline: Login with multiple errors username
    Given user at login page
    And user input username and password with "<Username>" and "<Password>"
    When user click login button
    Then user see error message "<Expected_Message>"
Examples:
    | Username        | Password      | Expected_Message                                                          |
    | unknown_use     | standard_user | Epic sadface: Username and password do not match any user in this service |
    |                 |               | Epic sadface: Username is required                                        |
    | locked_out_user | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                       |