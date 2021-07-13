Feature: Country Functionality


  @Regression
  Scenario: Erstellen  ein Land

  Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully

    And Navigate to Country
    When Create  a country
    Then Success message be displayed
