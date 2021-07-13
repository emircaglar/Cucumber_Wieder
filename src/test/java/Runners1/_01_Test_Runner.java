package Runners1;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

   features = {"src/test/java/FeatureFiles"},
      glue = {"StepDefinitions"},
        dryRun = false


)



public class _01_Test_Runner extends AbstractTestNGCucumberTests {
}
