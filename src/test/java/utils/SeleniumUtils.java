package utils;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumUtils extends TestBase {


    public static void sleep(long milliSeconds){

        try {
            Thread.sleep(milliSeconds);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void waitForClickability(WebElement element){
        WebDriverWait explicitWait = new WebDriverWait(driver,10);
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForVisibilityOfAll(List<WebElement> list){
        WebDriverWait explicitWait = new WebDriverWait(driver,10);
        explicitWait.until(ExpectedConditions.visibilityOfAllElements(list));
    }
    public static void waitForVisibilityOfElement(WebElement element){
        WebDriverWait explicitWait = new WebDriverWait(driver,10);
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitForPageToLoad(){
        ExpectedCondition<Boolean> pageLoadCondition = driver ->((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(pageLoadCondition);
    }
    public static void click(WebElement element){
        highlightElement(element);
        waitForClickability(element);
        element.click();
    }
    public static void sendKeys(WebElement element, String input){
        highlightElement(element);
        waitForVisibilityOfElement(element);
        element.sendKeys(input);
    }
    public static String getText(WebElement element){
        highlightElement(element);
        waitForVisibilityOfElement(element);
        return element.getText();
    }
    public static void moveIntoView(WebElement element){
        try{
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        for (int i=0; i<2; i++)
            try {
                if (i == 0)
                    js.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "color: black; border; 3px solid red; background: yellow");
                else {
                    sleep(500);
                    js.executeScript("argument[0].setAttribute('style',arguments[1]);", element, "");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

//    public static void switchToiFrame(String name){
//        driver.switchTo().frame("a-82bis0hukkpf");
//        click(driver.findElement(By.xpath("//span//div[@role='presentation'][1]")));
//
//    }


}
