package loadablepages;

import org.openqa.selenium.WebDriver;

public abstract class BaseLoadablePage {
    public WebDriver driver;

    public BaseLoadablePage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract boolean isPageOpened();
}