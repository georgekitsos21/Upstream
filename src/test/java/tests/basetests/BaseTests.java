package tests.basetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.BooksPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ProfilePage profilePage;
    protected BooksPage booksPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        booksPage = new BooksPage(driver);
    }
}
