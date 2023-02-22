package loadablepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCardLoadablePage extends BaseLoadablePage {
    private By ACTUAL_PRICE = By.className("inventory_item_price");
    private By ACTUAL_NAME_ITEM = By.className("inventory_item_name");

    private By LOGO = By.className("app_logo");

    public ShoppingCardLoadablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(LOGO).isDisplayed();
    }

    public String receiveActualPrice() {
        return driver.findElement(ACTUAL_PRICE).getText();
    }

    public String receiveNameItem() {
        return driver.findElement(ACTUAL_NAME_ITEM).getText();
    }
}