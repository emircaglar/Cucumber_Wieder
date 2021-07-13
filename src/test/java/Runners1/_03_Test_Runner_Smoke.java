package Runners1;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;


@CucumberOptions(


        tags = {"@Smoke"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = { //basit rapor oluşturan plugin
        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
}



)

public class _03_Test_Runner_Smoke extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReportWieder.xml");
        Reporter.setSystemInfo("Aplikation name","Basqar");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");



    }

}
