package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests  extends TestBase {
    @Test (priority 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        // Test Instantiation
        HomePage homePage = HomePage(driver);

        // Page Methods
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("manwe@lotrAcademy.org","123451243")
                .verifyLoginUserPassword("E-posta adresiniz veya şifreniz hatalı")
                .verifyLoginUserPassword("E-posta adresiniz veya şifreniz hatalı");
    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword() {
        // Home Instantiation
        HomePage homePage = new HomePage(driver);

        // Page methods
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("", "")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }
}
