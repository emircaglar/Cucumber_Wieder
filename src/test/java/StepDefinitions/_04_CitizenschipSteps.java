package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_CitizenschipSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("^Navigate to Citizenschip page$")
    public void navigateToCitizenschipPage() {

        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("citizenships");

    }

    @When("^User create a Citizenschip name as \"([^\"]*)\" and short name as \"([^\"]*)\"$")
    public void userCreateACitizenschipNameAsAndShortNameAs(String name, String shortName) {

        dc.findAndClick("addButton");
        dc.findAndSend("inputName", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("saveButton");
    }

    @Then("^Exist message should be displayed$")
    public void existMessageShouldBeDisplayed() {
        dc.findAndContainstext("alreadyExists", "already exists");
    }

    @And("^Click on  close button$")
    public void clickOnCloseButton() {
        dc.findAndClick("closeButton");
    }

    @When("^User delete  Citizenschip anme as \"([^\"]*)\"$")
    public void userDeleteCitizenschipAnmeAs(String name)  {
        dc.findaddDelete(name);

    }
}
