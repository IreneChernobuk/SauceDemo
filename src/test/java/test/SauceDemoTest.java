package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pompages.AccountCreatePage;
import pompages.ProductsPage;
import pompages.ShoppingCardPage;

public class SauceDemoTest extends BaseTest {
    final String USERNAME = "standard_user";
    final String PASSWORD = "secret_sauce";

    @Test
    public void logInTest() {
        AccountCreatePage accountCreatePage = new AccountCreatePage(driver);
        accountCreatePage.openAccountCreatePage();
        accountCreatePage.inputUserName(USERNAME);
        accountCreatePage.inputPassword(PASSWORD);
        accountCreatePage.clickLogin();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickAddToCard();
        String NameItem = productsPage.receiveItemName();
        String Price = productsPage.receivePrice();
        productsPage.clickShoppingCard();
        ShoppingCardPage shoppingCardPage = new ShoppingCardPage(driver);
        String actualPrice = shoppingCardPage.receiveActualPrice();
        String actualNameItem = shoppingCardPage.receiveNameItem();
        Assert.assertEquals(actualNameItem, NameItem, "the product name doesn't match");
        Assert.assertEquals(actualPrice, Price, "the product price doesn't match");
    }
}