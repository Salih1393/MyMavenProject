package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CyberTruckPage;

public class CyberTruckPageTest extends TestBase {

    CyberTruckPage cyberTruck;

    @BeforeMethod
    public void setup(){
        initializer();
         cyberTruck = new CyberTruckPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyNavigateToCyberTruckPage(){
        cyberTruck.navigateToCyberTruckPage();

        String expected = "Cybertruck | Tesla";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual, "Expected: " + expected + " | Actual: " + actual);

    }

    @Test
    public void verifyNavigateToCyberTruckOrderPage(){
        cyberTruck.navigateToCyberTruckOrderPage();

        String expected = "Design Your Cybertruck | Tesla";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual, "Expected: " + expected + " | Actual: " + actual);

    }


}
