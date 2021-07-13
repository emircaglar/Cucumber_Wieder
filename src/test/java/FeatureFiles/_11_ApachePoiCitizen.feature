Feature: Apache POI Citizen Functionalty

  Background:

    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
    And Navigate to Citizenschip page

  Scenario: Create and delete citizenship from Excel
    When User Create citizenship with ApachePOI
    Then User Delete citizenship with ApachePOI
    Then Success message be displayed
