package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testData.NewUserInfo;
import utils.SeleniumUtils;

public class RegisterPage extends TestBase {
    HomePage homePage = new HomePage();
    NewUserInfo user = new NewUserInfo();

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='password_confirm']")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//span//div[@role='presentation'][1]")
    public WebElement notRobot;

    //The button that completes the account creation process
    @FindBy(xpath = "")
    public WebElement createAcc_Btn;

    //The button which is under the Sign In Page block
    @FindBy(xpath = "//a[text()='Create an account']")
    public WebElement createAccount;

    public String iFrame = "a-82bis0hukkpf";

    public void navigateToCreateAccount(){
        homePage.clickSignInButton();
        SeleniumUtils.waitForVisibilityOfElement(createAccount);
        SeleniumUtils.click(createAccount);
    }

//    public void registerNewUser(){
//        navigateToCreateAccount();
//        SeleniumUtils.waitForPageToLoad();
//
//        SeleniumUtils.sendKeys(firstName,user.getFirstName());
//        SeleniumUtils.sendKeys(lastName,user.getLastName());
//        SeleniumUtils.sendKeys(email,user.getEmail());
//        SeleniumUtils.sendKeys(password,user.getPassword());
//        SeleniumUtils.sendKeys(passwordConfirm,user.getPassword());
//
//        SeleniumUtils.switchToiFrame(iFrame);
////        SeleniumUtils.click(notRobot);
//
//        SeleniumUtils.click(createAcc_Btn);
//
//
//    }

}
