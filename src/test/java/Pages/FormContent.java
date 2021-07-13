package Pages;

import Utilities.BaseDriver_Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    public FormContent() {
        PageFactory.initElements(BaseDriver_Singleton.getDriver(), this);
    }


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement ExamInputName;

    @FindBy(xpath = "(//span[contains(text(),'Academic Period')])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),' AP - 2021')]")
    private WebElement periodInputButton;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement optinGradeLevel1;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement optinGradeLevel2;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement optinGradeLevel3;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[5]")
    private WebElement optinGradeLevel4;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rigtScroll;
    @FindBy(xpath = "//mat-form-field//input")
    private WebElement deleteName;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;


    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton2;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "(//span[text()='Gender'])[1]")
    private WebElement gender;

    @FindBy(xpath = "//span[contains(text(),'Male')]")
    private WebElement male;

    @FindBy(xpath = "(//span[text()='Employee Type'])[1]")
    private WebElement employeeType;

    @FindBy(xpath = "(//span[text()='Document Type'])[1]")
    private WebElement documentType;

    @FindBy(xpath = "//input[@formcontrolname='employeeId']")
    private WebElement employeeID;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement employeeTypeOption;

    @FindBy(xpath = "//mat-option//span[@class='mat-option-text'][1]")
    private WebElement documentTypeOptions;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement documentNumber;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveForm;
    WebElement Myelement;

    public void findAndSend(String elemenName, String value) {

        switch (elemenName) {
            case "ExamInputName":
                Myelement = ExamInputName;
                break;

            case "deleteName":
                Myelement = deleteName;
                break;

            case "firstName":
                Myelement = firstName;
                break;

            case "lastName":
                Myelement = lastName;
                break;
            case "employeeID":
                Myelement = employeeID;
                break;

            case "documentNumber":
                Myelement = documentNumber;
                break;

        }

        sendKeysFunktion(Myelement, value);
    }

    public void findAndClick(String elemenName) {

        switch (elemenName) {
            case "academicPeriod":
                Myelement = academicPeriod;
                break;
            case "periodInputButton":
                Myelement = periodInputButton;
                break;

            case "gradeLevel":
                Myelement = gradeLevel;
                break;

            case "optinGradeLevel3":
                Myelement = optinGradeLevel3;
                break;
            case "optinGradeLevel1":
                Myelement = optinGradeLevel1;
                break;
            case "optinGradeLevel2":
                Myelement = optinGradeLevel2;
                break;
            case "optinGradeLevel4":
                Myelement = optinGradeLevel4;
                break;
            case "searchButton":
                Myelement = searchButton;
                break;
            case "deleteButton":
                Myelement = deleteButton;
                break;
            case "deleteButton2":
                Myelement = deleteButton2;
                break;

            case "gender":
                Myelement = gender;
                break;
            case "male":
                Myelement = male;
                break;
            case "employeeType":
                Myelement = employeeType;
                break;

            case "documentType":
                Myelement = documentType;
                break;
            case "employeeTypeOption":
                Myelement = employeeTypeOption;
                break;
            case "documentTypeOptions":
                Myelement = documentTypeOptions;
                break;
            case "saveForm":
                Myelement = saveForm;
                break;

        }
        clickFunction(Myelement);


        if (Myelement == employeeTypeOption) {
            esclick();
        }
    }

    public void findAndContainstext(String elemenName, String value) {

        switch (elemenName) {

        }
        verifyContainstext(Myelement, value);
    }


    public void findaddDelete(String deleteName) {

        scrollUpElement(rigtScroll);
        findAndSend("deleteName", deleteName);
        findAndClick("searchButton");

        //WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), 10);
        // wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),2 ));

        waitList_numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick("deleteButton");
        findAndClick("deleteButton2");


    }
/*
    List<WebElement> myelement;

    public void findAndChoose(String elemenName, String value) {

        switch (elemenName) {
            case "UserTypeOptions":
                myelement = UserTypeOptions;

        }
        UserTypeButton.click();
        UserTypeFunction(myelement, value);
    }

*/
}
