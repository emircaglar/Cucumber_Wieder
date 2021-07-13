package StepDefinitions;


import Pages.DialogContent;
import Pages.Parent;
import Utilities.BaseDriver_Singleton;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class _01_LoginStep {


    DialogContent dc=new DialogContent();
    @Given("^Navigate to basgar$")
    public void navigate_to_basgar()  {

        WebDriver driver= BaseDriver_Singleton.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();

    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button()  {


       // dc.username.sendKeys("richfield.edu");
       // dc.password.sendKeys("Richfield2020!");
       // dc.loginButton.click();



        dc.findAndSend("username","richfield.edu");
        dc.findAndSend("password","Richfield2020!");
        dc.findAndClick("cookies");
        dc.findAndClick("loginButton");

    }

    @Then("^User should be successfully$")
    public void user_should_be_successfully()  {
        Parent.waitUntilVisible(dc.dashboard);
        Assert.assertTrue(dc.dashboard.isDisplayed());


}}