package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _06_Data_Table {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("^Click on the Element in the LeftNav$")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String>Listelement=elements.asList(String.class);
        for (int i = 0; i <Listelement.size() ; i++) {
           ln.findAndClick(Listelement.get(i));
        }
    }

    @And("^Click on the Element in the DialogContent$")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {
        List<String>Listelement=elements.asList(String.class);
        for (int i = 0; i <Listelement.size() ; i++) {
          dc.findAndClick(Listelement.get(i));
        }
    }

    @When("^User sending keys in the DialogContent$")
    public void userSendingKeysInTheDialogContent(DataTable elements) {

        List<List<String>>listList=elements.asLists(String.class);
        for (int i = 0; i <listList.size() ; i++) {
            dc.findAndSend(listList.get(i).get(0),listList.get(i).get(1));
        }
    }
}
