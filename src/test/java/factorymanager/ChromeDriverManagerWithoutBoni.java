package factorymanager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.PropertyManager;

public class ChromeDriverManagerWithoutBoni extends DriverManager {

    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_CHROME"));
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
}