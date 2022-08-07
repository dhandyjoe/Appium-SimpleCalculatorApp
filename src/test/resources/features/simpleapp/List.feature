@login @android
Feature: Login

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    And user do scroll

  @test @positive
  Scenario: Long press function
    And long press on login button

  @test @positive
  Scenario: Tap multiple function
    When user double tap in first list
    Then toast should appear twice
