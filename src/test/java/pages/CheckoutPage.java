package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By zipField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By confirmationMessage = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCheckoutInfo(String first, String last, String zip) {
        driver.findElement(firstNameField).sendKeys(first);
        driver.findElement(lastNameField).sendKeys(last);
        driver.findElement(zipField).sendKeys(zip);
        driver.findElement(continueButton).click();
    }

    public void finishOrder() {
        driver.findElement(finishButton).click();
    }

    public String getConfirmationText() {
        return driver.findElement(confirmationMessage).getText();
    }
}