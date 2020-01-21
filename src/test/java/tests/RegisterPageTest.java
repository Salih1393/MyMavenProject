package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;

    @BeforeMethod
    public void setup(){
        initializer();
        registerPage = new RegisterPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyRegisterPageTitle(){
        registerPage.navigateToCreateAccount();

        String actual = driver.getTitle();
        String expected = "Tesla SSO – Create Account";
        Assert.assertEquals(expected, actual, "Expected: " + expected + " | Actual: " + actual);

    }

//    @Test
//    public void verifyAccountCreation(){
//        registerPage.registerNewUser();
//
//    }
}
