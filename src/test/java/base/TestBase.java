package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static final String propertyPath = "src/main/resources/configurations/configurations.properties";
    public static long implicitWait = Long.parseLong(ConfigReader.readProperty(propertyPath,"implicitWait"));
    private static String browser = ConfigReader.readProperty(propertyPath,"browser");
    private static String url = ConfigReader.readProperty(propertyPath,"url");

    public static void initializer(){

        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();


        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.get(url);
    }


}
