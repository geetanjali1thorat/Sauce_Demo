package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.DriverFactory;

public class NegativeLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void testLoginWithLockedOutUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");

        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Sorry, this user has been locked out"));
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.quitDriver();
    }
}
