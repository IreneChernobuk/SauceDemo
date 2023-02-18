package loadablepages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreateLoadablePage extends BaseLoadablePage {
    private By USER_NAME = By.id("user-name");
    private By PASSWORD = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");

    public AccountCreateLoadablePage(WebDriver driver) {
        super(driver);
    }

    public void openAccountCreatePage() {
        driver.get(Urls.REGISTER_FORM_URL);
    }

    public void inputUserName(String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
    }

    public void inputPassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(LOGIN_BUTTON).isDisplayed();
    }
}