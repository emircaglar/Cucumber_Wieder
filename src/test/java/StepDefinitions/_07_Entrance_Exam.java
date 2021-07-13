

package StepDefinitions;


import Pages.FormContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _07_Entrance_Exam {

    LeftNav ln=new LeftNav();
    FormContent fc=new FormContent();
    @Then("^Navigate to Entrance Exam$")
    public void navigateToEntranceExam(DataTable elements) {
        List<String>Listelement=elements.asList(String.class);
        for (int i = 0; i <Listelement.size() ; i++) {
            ln.findAndClick(Listelement.get(i));
        }
    }


    @Then("^User sending keys in the FormContent$")
    public void userSendingKeysInTheFormContent(DataTable elements) {

        List<List<String>>listList=elements.asLists(String.class);
        for (int i = 0; i <listList.size() ; i++) {
            fc.findAndSend(listList.get(i).get(0),listList.get(i).get(1));
        }
    }

    @Then("^Click on the Element in the FormContent$")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String>Listelement=elements.asList(String.class);
        for (int i = 0; i <Listelement.size() ; i++) {
            fc.findAndClick(Listelement.get(i));
        }
    }

    @When("^User delete the  \"([^\"]*)\" from FormContent$")
    public void userDeleteTheFromFormContent(String name) {
       fc.findaddDelete(name);
    }
}
