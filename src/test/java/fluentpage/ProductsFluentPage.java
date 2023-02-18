package fluentpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pompages.BasePage;

public class ProductsFluentPage extends BaseFluentPage {
    public ProductsFluentPage(WebDriver driver) {
        super(driver);
    }

    private By ITEM_ADD_BUTTON = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    private By ITEM_NAME = By.xpath("//a[@id='item_4_title_link']/div");
    private By PRICE = By.xpath("//button[@id='remove-sauce-labs-backpack']/parent::div/div");
    private By SHOPPING_CARD_BUTTON = By.className("shopping_cart_link");

    public ProductsFluentPage clickAddToCard() {
        driver.findElement(ITEM_ADD_BUTTON).click();
        return this;
    }

    public String receiveItemName() {
        return driver.findElement(ITEM_NAME).getText();
    }

    public String receivePrice() {
        return driver.findElement(PRICE).getText();
    }

    public ShoppingCardFluentPage clickShoppingCard() {
        driver.findElement(SHOPPING_CARD_BUTTON).click();
        return new ShoppingCardFluentPage(driver);
    }
}