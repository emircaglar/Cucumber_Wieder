Feature: DataTable Functionalty

  Scenario: Create a Country
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
   # Then Navigate to Country

    And Click on the Element in the LeftNav
      | setup      |
      | parameters |
      | country    |


    And Click on the Element in the DialogContent
      | addButton  |

    When User sending keys in the DialogContent
      | inputName |diyarabbkirrr|
      | inputCode |2777|

    And Click on the Element in the DialogContent
      | saveButton  |

  Scenario: Create a Nationalty
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
   # Then Navigate to Country

    And Click on the Element in the LeftNav
      | setup      |
      | parameters |
      | nationalities    |


    And Click on the Element in the DialogContent
      | addButton  |

    When User sending keys in the DialogContent
      | inputName |diyarabbkirschs|


    And Click on the Element in the DialogContent
      | saveButton  |

  Scenario: Create a Nationalty
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
   # Then Navigate to Country

    And Click on the Element in the LeftNav
      | setup      |
      | parameters |
      | fees    |


    And Click on the Element in the DialogContent
      | addButton  |

    When User sending keys in the DialogContent
      | inputName |ahmet|
      | inputCode |189|
      | integrationCode |1234|
      | priorityCode |5|


    And Click on the Element in the DialogContent
      | saveButton  |