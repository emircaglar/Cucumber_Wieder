package StepDefinitions;

import Pages.DialogContent;
import Utilities.excelUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _11_ApachePOI {
    DialogContent dc = new DialogContent();

    @When("^User Create citizenship with ApachePOI$")
    public void userCreateCitizenshipWithApachePOI() {
        List<List<String>> listeExcel = excelUtility.getListData("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx", "testCitizen", 2);
        for (int i = 0; i < listeExcel.size(); i++) {
            dc.findAndClick("addButton");
            dc.findAndSend("inputName", listeExcel.get(i).get(0));
            dc.findAndSend("shortName", listeExcel.get(i).get(1));
            dc.findAndClick("saveButton");
        }


    }

    @Then("^User Delete citizenship with ApachePOI$")
    public void userDeleteCitizenshipWithApachePOI() {
        List<List<String>> listeExcel = excelUtility.getListData("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx", "testCitizen", 2);
        for (int i = 0; i < listeExcel.size(); i++) {
            dc.findaddDelete(listeExcel.get(i).get(0));

        }
    }
}