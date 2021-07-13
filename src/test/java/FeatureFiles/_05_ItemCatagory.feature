Feature: Item Catagory Functionalty

  Background:
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully

  Scenario Outline:
    Given Navigate to ItemCatagory
    When User create a Item catagory name as "<Itemname>" user type "<Usertype>"
    Then Success message be displayed

    When User delete the  "<Itemname>"
    Then Success message be displayed

    Examples:
      | Itemname | Usertype |
      | laptops12 | Teacher  |
      | tvs12     | Manager  |
      | lampes12  | Student  |