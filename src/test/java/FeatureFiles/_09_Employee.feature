Feature: Employee Functionalty
  @Regression
  Scenario: Create Employee
    Given Navigate to basgar
    When Enter username and password and click login button
    Then User should be successfully

    Then Click on the Element in the LeftNav
    |humanResources|
    |employees|

    Then Click on the Element in the DialogContent
      | addButton |

    Then User sending keys in the FormContent
       |firstName|ajdarte|
       |lastName|pekdete|
       |employeeID|129000|
       |documentNumber|123000|

    Then Click on the Element in the FormContent
    |gender|
    |male|
    |employeeType|
    |employeeTypeOption|
    |documentType|
    |documentTypeOptions|
    |saveForm|



    Then Success message be displayed