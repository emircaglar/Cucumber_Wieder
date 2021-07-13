Feature: Scenari Out Funtionalty

  Scenario Outline: Enrance Exam with Scenario Outline

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
      | ExamInputName | <ExamName> |

    Then Click on the Element in the FormContent
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |

    And Click on the Element in the DialogContent
      | saveButton |

    Then Success message be displayed

    Then Navigate to Entrance Exam
      | entranceExamseesFirst  |
      | setupExam              |
      | entranceExamseesSecond |

    When User delete the  "<ExamName>" from FormContent

    Then Success message be displayed

    Examples:
      | ExamName | AcademicPeriodOption | GradeLevelOption |
      | mte1     | periodInputButton    | optinGradeLevel1 |
      | mte2     | periodInputButton    | optinGradeLevel2 |
      | mte3     | periodInputButton    | optinGradeLevel3 |
      | mte4     | periodInputButton    | optinGradeLevel4 |