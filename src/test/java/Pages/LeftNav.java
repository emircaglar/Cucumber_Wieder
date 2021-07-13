package Pages;

import Utilities.BaseDriver_Singleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends  Parent{

public LeftNav(){
    PageFactory.initElements(BaseDriver_Singleton.getDriver(),this);
}

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath="//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath="(//span[text()='Countries'])[1]")
    private WebElement country;
 @FindBy(xpath="(//span[text()='Nationalities'])[1]")
    private WebElement nationalities;

    @FindBy(xpath="//span[text()='Citizenships']")
    private WebElement citizenships;

    @FindBy(xpath="(//span[text()='Inventory'])[1]")
    private WebElement inventory;

    @FindBy(xpath="(//span[text()='Item Categories'])[1]")
    private WebElement itemCategories;

    @FindBy(xpath="(//span[text()='Setup'])[4]")
    private WebElement setupzwei;

    @FindBy(xpath="//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamseesFirst;

   @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupExam;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamseesSecond;

 @FindBy(xpath="//span[text()='Human Resources']")
    private WebElement humanResources;

 @FindBy(xpath="//span[text()='Employees']")
    private WebElement employees;

    WebElement Myelement;
    public  void findAndClick(String elemenName){

        switch (elemenName){
            case "setup":
                Myelement=setup;
                break;
            case "parameters":
                Myelement=parameters;
                break;

                case "country":
                Myelement=country;
                break;

                case "citizenships":
                Myelement=citizenships;
                break;

                case "inventory":
                Myelement=inventory;
                break;

                case "setupzwei":
                Myelement=setupzwei;
                break;

                case "itemCategories":
                Myelement=itemCategories;
                break;

                case "nationalities":
                Myelement=nationalities;
                break;

                case "fees":
                Myelement=fees;
                break;
                case "entranceExamseesFirst":
                Myelement=entranceExamseesFirst;
                break;
                case "setupExam":
                Myelement=setupExam;
                break;
                case "entranceExamseesSecond":
                Myelement=entranceExamseesSecond;
                break;
                case "humanResources":
                Myelement=humanResources;
                break;

                case "employees":
                Myelement=employees;
                break;

        }

        clickFunction(Myelement);



    }
}
