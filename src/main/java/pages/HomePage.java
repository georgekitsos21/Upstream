package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginButton = By.id("login");
    private By textElement = By.xpath("//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[1]/span[1]/div[1]/div[2]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
    public void clickTextElement(){
        driver.findElement(textElement).click();
    }
}
