package Runners1;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

 features = {"src/test/java/FeatureFiles/_01_Login.feature","src/test/java/FeatureFiles/_02_Country.feature","src/test/java/FeatureFiles/_03_CountryMultiplyScenaryo.feature"  } ,
 glue = {"StepDefinitions"}



)
public class _02_Belirli_Sayfalar_Run extends AbstractTestNGCucumberTests {
}
