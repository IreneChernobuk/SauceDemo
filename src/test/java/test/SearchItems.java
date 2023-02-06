package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItems {
    WebDriver driver;
    WebElement element_password1 = driver.findElement(By.id("password")); //
    WebElement element_class = driver.findElement(By.className("submit-button btn_action"));
    WebElement element_name = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
    WebElement linkTwitter = driver.findElement(By.linkText("Twitter"));
    WebElement element_tag = driver.findElement(By.tagName("noscript"));
    WebElement element_link2 = driver.findElement(By.partialLinkText("LinkedIn"));//
    WebElement element_button = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
    WebElement element_div = driver.findElement(By.xpath("//div[text()='standard_user']"));
    WebElement element_button2 = driver.findElement(By.xpath("//button[contains(@name, 'remove-sauce-labs-bolt-t-shirt')]"));
    WebElement product_name = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt')]"));
    WebElement element_form = driver.findElement(By.xpath("//*[input[@id='user-name']]//ancestor::form"));
    WebElement element_password = driver.findElement(By.xpath("//div/descendant::input[@name='user-name']"));
    WebElement element_button_remove = driver.findElement(By.xpath("//div/following::button[@class='btn btn_secondary btn_small btn_inventory'][2]"));
    WebElement element_button_open_menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']/parent::div"));
    WebElement element_button_password = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
    WebElement elem = driver.findElement(By.cssSelector("[.submit-button]"));
    WebElement button = driver.findElement(By.cssSelector("[.btn.btn_secondary.btn_small]"));
    WebElement price = driver.findElement(By.cssSelector("[.item_pricebar .inventory_item_price]"));
    WebElement button_cont_shop = driver.findElement(By.cssSelector("[#continue-shopping]"));
    WebElement tagName = driver.findElement(By.cssSelector("[noscript]"));
    WebElement button_basket = driver.findElement(By.cssSelector("[span.shopping_cart_badge]"));
    WebElement elementUsername = driver.findElement(By.cssSelector("[name=user-name]"));
    WebElement elementinput = driver.findElement(By.cssSelector("[class~=btn_action]"));
    WebElement button_Menu = driver.findElement(By.cssSelector("[id|=react-burger-menu-btn]"));
    WebElement link = driver.findElement(By.cssSelector("a[href^=\"https://sause\"]"));
    WebElement element_img = driver.findElement(By.cssSelector("img[src$=\".png\"]"));
    WebElement img_jacket = driver.findElement(By.cssSelector("img[alt*=\"Jacket\"] "));
    WebElement element_unput_cross = driver.findElement(By.cssSelector("svg:first-child"));
    WebElement element_select = driver.findElement(By.cssSelector("select:nth-child(2)"));
}