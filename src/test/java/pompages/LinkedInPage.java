package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedInPage extends BasePage {

    private By LOGO = By.cssSelector("[data-test-id=nav-logo]");
    private By TITLE = By.partialLinkText("Linked");

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    public void waitTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
    }

    public boolean isLogoDisplayed() {
        return driver.findElement(LOGO).isDisplayed();
    }
}