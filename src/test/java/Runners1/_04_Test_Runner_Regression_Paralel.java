package Runners1;

import Utilities.BaseDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(


        tags = {"@Regression"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},

        plugin = { //basit rapor oluşturan plugin
        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
}



)

public class _04_Test_Runner_Regression_Paralel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforClass (String browser)  {
       BaseDriver.threadBrowserName.set(browser);
    }
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
