package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    private By firstItemAddToCart = By.cssSelector(".inventory_item button");
    private By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstItemToCart() {
        driver.findElement(firstItemAddToCart).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}