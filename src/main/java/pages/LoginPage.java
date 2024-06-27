package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private  WebDriver driver;
    private  By userNameInput = By.id("userName");
    private  By passwordInput = By.id("password");
    private  By loginButton = By.cssSelector("#login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Fulfill the username field
    public void setUserNameInput(String username) {
        driver.findElement(userNameInput).sendKeys(username);
    }

    //Fulfill the password field
    public void setPasswordInput(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    //click to the login button
    public ProfilePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new ProfilePage(driver);
    }
}