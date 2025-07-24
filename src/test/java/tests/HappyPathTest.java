package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utils.DriverFactory;

public class HappyPathTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void testSuccessfulPurchaseFlow() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addFirstItemToCart();
        inventoryPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutInfo("John", "Doe", "12345");
        checkoutPage.finishOrder();

        Assert.assertEquals(checkoutPage.getConfirmationText(), "Thank you for your order!");
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.quitDriver();
    }
}