Feature: Entrance Exam Functionalty

  Scenario: Enrance Exam

    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully
    Then Navigate to Entrance Exam
      | entranceExamseesFirst  |
      | setupExam              |
      | entranceExamseesSecond |

    Then Click on the Element in the DialogContent
      | addButton |

    Then User sending keys in the FormContent
      | ExamInputName | historyi |

    Then Click on the Element in the FormContent
      | academicPeriod |
      | periodInputButton |
      | gradeLevel |
      | optinGradeLevel3 |
    
    And Click on the Element in the DialogContent
      | saveButton  |

    Then Success message be displayed

    Then Navigate to Entrance Exam
      | entranceExamseesFirst  |
      | setupExam              |
      | entranceExamseesSecond |

     When User delete the  "historyi" from FormContent

    Then Success message be displayed
    