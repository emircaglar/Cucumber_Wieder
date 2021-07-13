package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class _05_Item_Catagories {

    LeftNav ln = new LeftNav();
    DialogContent dc=new DialogContent();

    @Given("^Navigate to ItemCatagory$")
    public void navigateToItemCatagory() {
        ln.findAndClick("inventory");
        ln.findAndClick("setupzwei");
        ln.findAndClick("itemCategories");

    }

    @When("^User create a Item catagory name as \"([^\"]*)\" user type \"([^\"]*)\"$")
    public void userCreateAItemCatagoryNameAsUserType(String name, String type) {
        dc.findAndClick("addButton");
        dc.findAndSend("inputName", name);
        dc.findAndChoose("UserTypeOptions",type);
        dc.findAndClick("saveButton");
    }

    @When("^User delete the  \"([^\"]*)\"$")
    public void userDeleteThe(String name)  {
        dc.findaddDelete(name);

    }
}
