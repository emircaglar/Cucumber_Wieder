Feature: Multiple Scenaryo
  Background:
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
    Then Navigate to Country
  @Regression
  Scenario:

    Then Create  a country
    Then Success message be displayed


    Scenario: Create a Country with parameter data

      Then Create  a country name as  "ankrab" code as "066142"
      Then Success message be displayed


  Scenario Outline: Create a Country with Outline data

    Then Create  a country name as  "<name>" code as "<code>"
    Then Success message be displayed

    Examples:
      |name  |code|
      |canakkalemme  |18833|
      |corummme  |19934|