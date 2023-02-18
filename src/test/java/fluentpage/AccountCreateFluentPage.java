package fluentpage;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreateFluentPage extends BaseFluentPage {
    private By USER_NAME = By.id("user-name");
    private By PASSWORD = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");

    public AccountCreateFluentPage(WebDriver driver) {
        super(driver);
    }

    public AccountCreateFluentPage openAccountCreatePage() {
        driver.get(Urls.REGISTER_FORM_URL);
        return this;
    }

    public AccountCreateFluentPage inputUserName(String userName) {
        driver.findElement(USER_NAME).sendKeys(userName);
        return this;
    }

    public AccountCreateFluentPage inputPassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }

    public ProductsFluentPage clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return new ProductsFluentPage(driver);
    }
}