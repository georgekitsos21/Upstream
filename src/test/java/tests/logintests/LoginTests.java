package tests.logintests;

import org.testng.annotations.Test;
import pages.LoginPage;
import tests.basetests.BaseTests;

public class LoginTests extends BaseTests {

    @Test (priority = 1)
    public void testLogin() {
        LoginPage loginpage = homePage.clickLoginButton();
        loginpage.setUserNameInput("upstream");
        loginpage.setPasswordInput("Asd123!.");
        loginpage.clickLoginButton();
    }

    @Test(priority = 2)
    public void testLogOut(){
        profilePage.clickLogoutButton();
    }
}
