package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginButton = By.id("login");

    //Create the Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Click to login button
    public LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
}
