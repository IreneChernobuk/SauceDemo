package factorymanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PropertyManager;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_FIREFOX"));
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}