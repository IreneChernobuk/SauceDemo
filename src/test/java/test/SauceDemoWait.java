package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AccountCreatePage;
import pompages.LinkedInPage;
import pompages.ProductsPage;

public class SauceDemoWait extends BaseTest {
    @Test
    public void checkIsLogoDisplayed() {
        final String USERNAME = "standard_user";
        final String PASSWORD = "secret_sauce";

        AccountCreatePage accountCreatePage = new AccountCreatePage(driver);
        accountCreatePage.openAccountCreatePage();
        accountCreatePage.inputUserName(USERNAME);
        accountCreatePage.inputPassword(PASSWORD);
        accountCreatePage.clickLogin();
        removeImplicitlyWait();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.waitLink();
        productsPage.clickLinkedInLink();
        productsPage.switchToLink();
        LinkedInPage linkedPage = new LinkedInPage(driver);
        linkedPage.waitTitle();
        Assert.assertTrue(linkedPage.isLogoDisplayed(), "isn't logo displayed");
    }
}