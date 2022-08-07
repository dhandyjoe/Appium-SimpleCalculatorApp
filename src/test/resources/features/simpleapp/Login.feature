@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @negative
  Scenario: Verify user failed to login when input invalid email and password
    Given user is on login page
    When user input username "invalid"
    And user input password "invalid"
    And user click button login
    Then toast should appear with text Login Failed

  @test @positive
  Scenario: Long press function
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    And long press on login button
