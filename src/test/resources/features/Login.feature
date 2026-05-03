@Login
Feature: Login
  @valid-credential
  Scenario: Login With Valid Credential
    Given user at login page
    And user input username and password with "standard_user" and "secret_sauce"
    When user click login button
    Then user redirect to home page
    And user see product list