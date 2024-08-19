package pageObjects.Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    public void forgotPassword() {
        driver.findElement(By.linkText("Forgot password?")).click();
    }

    public void navigateToHappyFoxHomePageURL(String adminPortalURL) {
        //logic to navigate to HappyFoxHomePageURL
    }

    public void enterUsername(String username) {
        //logic to enter username
    }

    public void enterPassword(String password) {
        //logic to enter password
    }

    public void clickLoginbutton() {
        //logic to click login button
    }

    public AdminPortalTest1stPage validatePendingTicketsTitle1() {
        //logic to validate pending tickets title
        return new AdminPortalTest1stPage(driver);
    }

    public void validatePendingTicketsTitle() {
        //logic to validate pending tickets title
    }
}

