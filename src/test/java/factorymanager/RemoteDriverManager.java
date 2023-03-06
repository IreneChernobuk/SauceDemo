package factorymanager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RemoteDriverManager extends DriverManager {
    @Override
    public void createDriver() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            driver = new RemoteWebDriver(new URL("https://oauth-irinkabuc-fc446:2ad859eb-e883-4540-82ef-db2942a49095@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), browserOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}