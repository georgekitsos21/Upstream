package tests.booktests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.basetests.BaseTests;
import java.util.Arrays;
import java.util.List;

public class BookTests extends BaseTests {

    @Test
    public void testBooks() {
        LoginPage loginpage = homePage.clickLoginButton();
        loginpage.setUserNameInput("upstream");
        loginpage.setPasswordInput("Asd123!.");
        loginpage.clickLoginButton();
        booksPage.scrollToFooter();
        List<String> expectedBooks = Arrays.asList("Git Pocket Guide", "Learning JavaScript Design Patterns",
                "Designing Evolvable Web APIs with ASP.NET",  "Speaking JavaScript",  "You Don't Know JS",
                "Programming JavaScript Applications",  "Eloquent JavaScript, Second Edition",
                "Understanding ECMAScript 6");
        List<String> actualBooks = booksPage.getTitleOfTheBooks();
        Assert.assertEquals(actualBooks, expectedBooks, "Book list does not match!");
    }
}
