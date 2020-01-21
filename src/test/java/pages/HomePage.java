package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='tds-header-nav--list_link tds-link_for-login tds-header-nav--auth_link']")
    public WebElement signIn;

    public String getTitle(){
        SeleniumUtils.waitForPageToLoad();
        return driver.getTitle();
    }

    public void clickSignInButton(){
        SeleniumUtils.click(signIn);
    }

}
