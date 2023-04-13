package test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AccountCreatePage;
import pompages.ProductsPage;
import pompages.ShoppingCardPage;
import utils.RetryAnalyzer;

@Epic("User Management")
@Feature("Registration")
@Story("User Registration")
public class SauceDemoTest extends BaseWithThreadLocalTest {
    final String USERNAME = "standard_user";
    final String PASSWORD = "secret_sauce";

    @Test(retryAnalyzer = RetryAnalyzer.class, invocationCount = 2, threadPoolSize = 2)
    @Description("compare item name and price")
    @Issue("QA-125")
    @Severity(SeverityLevel.NORMAL)
    public void logInTest() {
        AccountCreatePage accountCreatePage = new AccountCreatePage(getDriver());
        accountCreatePage.openAccountCreatePage();
        accountCreatePage.inputUserName(USERNAME);
        accountCreatePage.inputPassword(PASSWORD);
        accountCreatePage.clickLogin();
        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.clickAddToCard();
        String NameItem = productsPage.receiveItemName();
        String Price = productsPage.receivePrice();
        productsPage.clickShoppingCard();
        ShoppingCardPage shoppingCardPage = new ShoppingCardPage(getDriver());
        String actualPrice = shoppingCardPage.receiveActualPrice();
        String actualNameItem = shoppingCardPage.receiveNameItem();
        Assert.assertEquals(actualNameItem, NameItem, "the product name doesn't match");
        Assert.assertEquals(actualPrice, Price, "the product price doesn't match");
    }
}