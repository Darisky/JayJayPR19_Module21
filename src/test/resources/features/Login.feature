@Login
Feature: Login
  @valid-credential
  Scenario: Login With Valid Credential
    Given user at login page
    And user input username and password with "standard_user" and "secret_sauce"
    When user click login button
    Then user redirect to home page
    And user see product list

  @invalid-credential
  Scenario: Login With inValid Credential
    Given user at login page
    And user input username and password with "unknown_user" and "standard_user"
    When user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"