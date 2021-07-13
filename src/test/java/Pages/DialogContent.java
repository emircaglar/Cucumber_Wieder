package Pages;

import Utilities.BaseDriver_Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(BaseDriver_Singleton.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cookies;
    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    public WebElement dashboard;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement inputName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement inputCode;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successfullyMessage;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement deleteName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private List<String> deleteButtonList;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton2;

    @FindBy(css = "div>mat-option>span")
    private List<WebElement> UserTypeOptions;

    @FindBy(xpath = "//Mat-chip-list[@formcontrolname='roles']//input")
    private WebElement UserTypeButton;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rigtScroll;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement ExamInputName;


    WebElement Myelement;

    public void findAndSend(String elemenName, String value) {

        switch (elemenName) {
            case "username":
                Myelement = username;
                break;
            case "password":
                Myelement = password;
                break;
            case "inputName":
                Myelement = inputName;
                break;
            case "inputCode":
                Myelement = inputCode;
                break;
            case "shortName":
                Myelement = shortName;
                break;

            case "deleteName":
                Myelement = deleteName;
                break;

            case "integrationCode":
                Myelement = integrationCode;
                break;

            case "priorityCode":
                Myelement = priorityCode;
                break;
        }

        sendKeysFunktion(Myelement, value);
    }

    public void findAndClick(String elemenName) {

        switch (elemenName) {
            case "loginButton":
                Myelement = loginButton;
                break;
            case "cookies":
                Myelement = cookies;
                break;
            case "addButton":
                Myelement = addButton;
                break;
            case "saveButton":
                Myelement = saveButton;
                break;
            case "closeButton":
                Myelement = closeButton;
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


        }
        clickFunction(Myelement);
    }

    public void findAndContainstext(String elemenName, String value) {

        switch (elemenName) {
            case "successfullyMessage":
                Myelement = successfullyMessage;
                break;
            case "alreadyExists":
                Myelement = alreadyExists;
                break;

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

    List<WebElement> myelement;

    public void findAndChoose(String elemenName, String value) {

        switch (elemenName) {
            case "UserTypeOptions":
                myelement = UserTypeOptions;

        }
        UserTypeButton.click();
        UserTypeFunction(myelement, value);
    }


}
