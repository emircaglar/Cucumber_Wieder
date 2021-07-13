package StepDefinitions;


import Utilities.BaseDriver;
import Utilities.BaseDriver_Singleton;
import Utilities.excelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public  class Hooks {

    @Before
   public void befor(Scenario scenario){
        System.out.println("scenario Name = " + scenario.getName());



    }
    @After
    public static void after(Scenario scenario){

        System.out.println("scenario.isFailed() = " + scenario.isFailed());
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");


        if (scenario.isFailed()){

            TakesScreenshot screenshot = (TakesScreenshot) BaseDriver_Singleton.getDriver();
            File ekranDosyasi = screenshot.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(ekranDosyasi,
                        new File("target/FailedScreenShots/"+ scenario.getId()+date.format(formatter)+".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }




        }
        excelUtility.writeExcel("src/test/java/ApachePOI/Resources/yeniScenario.xlsx",scenario, BaseDriver.threadBrowserName.get(), date.format(formatter));


      BaseDriver_Singleton.DriverQuit();

    }
}
