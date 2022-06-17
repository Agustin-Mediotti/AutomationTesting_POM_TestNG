package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    // Constructor
    public BasePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    // Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementslocatedBy(elementBy));
    }

    // Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    // Write Text
    public void write (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    // Read Text
    public String read (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    // Assert
    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }
}

// TODO: LoginPage
