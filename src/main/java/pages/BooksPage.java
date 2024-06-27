package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BooksPage {
    private WebDriver driver;
    private By listOftheBooks = By.cssSelector(".rt-tbody .rt-tr-group");
    private By scrollInToFooter = By.xpath("//div[@class='-pagination']");

    //Create the Constructor
    public BooksPage(WebDriver driver){
        this.driver = driver;
    }

    //Check the number of the books
    public List<String> getTitleOfTheBooks(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://demoqa.com/books"));
        List<WebElement> books = driver.findElements(listOftheBooks);
        List<String> booksTitles = new ArrayList<>();
        for(WebElement book : books){
           booksTitles.add(book.getText());
        }
        return booksTitles;
    }


    public void scrollToFooter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(scrollInToFooter));
        WebElement scrollInToFooter = driver.findElement(this.scrollInToFooter);
        String script = "arguments[0].scrollIntoView(true)";
        ((JavascriptExecutor)driver).executeScript(script, scrollInToFooter);
    }
}

