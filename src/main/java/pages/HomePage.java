package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

public class HomePage extends BasePage {

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Page Variables
    String baseURL = "http://www.n11.com/";

    // Web Elements
    By singInButtonBy = By.className("btnSignIn");

    // Page Methods
    // Go to Homepage
    public HomePage goToN11() {
        driver.get(baseURL);
        return this;
    }

    // Login Page
    public LoginPage goToLoginPage() {
        click(singInButtonBy);
        return new LoginPage(driver);
    }
}