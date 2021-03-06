package Pages;

import Utilities.BaseDriver_Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Parent {

    public void sendKeysFunktion(WebElement element, String value) {

        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }


    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver_Singleton.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver_Singleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    } public void scrollUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver_Singleton.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void verifyContainstext(WebElement element, String value) {
        waitUntilVisible(element); //warten bis das Element erscheint
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));// clicken das Element

    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver_Singleton.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public List<WebElement> waitUntilAllElementvisible(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(BaseDriver_Singleton.getDriver(), 30);
        for (WebElement e:elements
             ) {
            scrollToElement(e);
        }
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
       return elements;
    }
    public void waitList_numberOfElementsToBeLessThan(By selector, int number) {
        WebDriverWait wait=new WebDriverWait(BaseDriver_Singleton.getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector,number));

    }  public void UserTypeFunction(List<WebElement> list, String option)
    {
        //List den istenen eleman click yapacak
        for(WebElement e: list)
        {
            if (e.getText().contains(option)) {
                e.click();
                break;
            }
        }
    }

    public static void Wait(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void esclick()
    {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }}

}
