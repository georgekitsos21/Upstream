package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProfilePage {
    private WebDriver driver;
    private By clickLogOut = By.xpath("//button[@id='submit']");

    //Create the constructor
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    //Click to log out button
    public LoginPage clickLogoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickLogOut)).click();
        return new LoginPage(driver);
    }
}
