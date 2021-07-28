Feature: Test With JDBC

  Background:
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
    And Navigate to Country

    Scenario: Country Testing With Database
      Then  Send the query the database "select * from country_e" and control match
