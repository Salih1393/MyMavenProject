package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class CyberTruckPage extends TestBase {

    public CyberTruckPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Cybertruck']")
    public WebElement cyberTruckPage;

    @FindBy(xpath = "//a[@data-button-text-desktop='Order Now']")
    public WebElement cyberTruckOrder;

    public void navigateToCyberTruckPage(){
        SeleniumUtils.click(cyberTruckPage);
    }

    public void navigateToCyberTruckOrderPage(){
        navigateToCyberTruckPage();
        SeleniumUtils.click(cyberTruckOrder);
    }
}
