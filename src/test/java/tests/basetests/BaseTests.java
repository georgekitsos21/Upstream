package tests.basetests;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.BooksPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import java.io.File;
import java.io.IOException;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected BooksPage booksPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        booksPage = new BooksPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    @AfterMethod
    public void takeScreenshot() {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("resources/screenshots/test_results.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}