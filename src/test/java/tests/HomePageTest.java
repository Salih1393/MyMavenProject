package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        initializer();
        homePage = new HomePage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomePageTitle(){
        String actual = homePage.getTitle();
        Assert.assertEquals(actual, "Electric Cars, Solar & Clean Energy | Tesla");

    }

    @Test
    public void verifySignInButton(){
        String expectedTitle = "Tesla SSO - Sign In";
        homePage.clickSignInButton();
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }





}
