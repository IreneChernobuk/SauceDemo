package factorymanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import utils.PropertyManager;

public class FirefoxDriverManagerWithoutBoni extends DriverManager {

    @Override
    public void createDriver() {
        PropertyManager propertyManager = new PropertyManager();
        System.setProperty("webdriver.gecko.driver", "PATH_TO_FIREFOX");
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        driver = new FirefoxDriver(options);
    }
}