package test;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SauceDemoTestWithoutArchitecture extends BaseTest{
    final String USERNAME = "standard_user";
    final String PASSWORD = "secret_sauce";

    @Test
    public void logInTest() {
        driver.get(Urls.REGISTER_FORM_URL);
        driver.findElement(By.id("user-name")).sendKeys(USERNAME);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
        String NameItem = driver.findElement(By.xpath("//a[@id='item_4_title_link']/div")).getText();
        String Price = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/parent::div/div")).getText();
        driver.findElement(By.className("shopping_cart_link")).click();
        String actualPrice = driver.findElement(By.className("inventory_item_price")).getText();
        String actualNameItem = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(actualNameItem, NameItem, "the product name doesn't match");
        Assert.assertEquals(actualPrice, Price, "the product price doesn't match");
    }
}