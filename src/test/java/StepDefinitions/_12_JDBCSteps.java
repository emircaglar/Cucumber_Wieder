package StepDefinitions;

import Pages.DialogContent;
import Utilities.DB_Utilities;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _12_JDBCSteps {
    @Then("^Send the query the database \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabaseAndControlMatch(String query)  {
        List<List<String>> dbList= DB_Utilities.getListData(query);
        System.out.println("dbList = " + dbList);
        // database


        // Web list
        DialogContent dc=new DialogContent();
       List<WebElement> UnitList=dc.waitUntilAllElementvisible(dc.nameList);
        for (WebElement e:UnitList
             ) {
            System.out.println("e.getText() = " + e.getText());
        }


        for (int i = 0; i <dbList.size() ; i++) {
            Assert.assertEquals(dbList.get(i).get(1),UnitList.get(i).getText());
        }
    }
}
