package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCardPage extends BasePage {
    private By ACTUAL_PRICE = By.className("inventory_item_price");
    private By ACTUAL_NAME_ITEM = By.className("inventory_item_name");

    public ShoppingCardPage(WebDriver driver) {
        super(driver);
    }

    public String receiveActualPrice() {
        return driver.findElement(ACTUAL_PRICE).getText();
    }

    public String receiveNameItem() {
        return driver.findElement(ACTUAL_NAME_ITEM).getText();
    }
}