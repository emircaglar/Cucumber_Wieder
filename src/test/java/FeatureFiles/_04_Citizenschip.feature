Feature: Citizen Functionalty

  Background:

    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
    And Navigate to Citizenschip page
  @Regression
  Scenario Outline:Create a Citizenschip

    When User create a Citizenschip name as "<name>" and short name as "<shortname>"
    Then Success message be displayed


    When User create a Citizenschip name as "<name>" and short name as "<shortname>"
    Then Exist message should be displayed
    And Click on  close button

    When User delete  Citizenschip anme as "<name>"
    Then Success message be displayed

    Examples:
      | name |shortname|
      | alim191112 |shor191212|
      | velim191112|shor191312|
