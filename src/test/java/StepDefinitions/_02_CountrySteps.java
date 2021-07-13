package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_CountrySteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Then("^Navigate to Country$")
    public void navigate_to_Country() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("country");
    }

    @When("^Create  a country$")
    public void create_a_country() {

        dc.findAndClick("addButton");
        dc.findAndSend("inputName", "erdinnwc");
        dc.findAndSend("inputCode", "1267889");
        dc.findAndClick("saveButton");

    }

    @Then("^Success message be displayed$")
    public void success_message_be_displayed() {
   dc.findAndContainstext("successfullyMessage","success");
    }

    @Then("^Create  a country name as  \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createACountryNameAsCodeAs(String name, String code)  {
        dc.findAndClick("addButton");
        dc.findAndSend("inputName", name);
        dc.findAndSend("inputCode", code);
        dc.findAndClick("saveButton");
    }
}
