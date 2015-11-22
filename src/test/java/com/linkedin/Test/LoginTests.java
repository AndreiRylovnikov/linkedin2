package com.linkedin.Test;



import com.linkedin.HomePage;
import com.linkedin.LoginRegistrationPage;
import com.linkedin.ProfilePage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests {

    private LoginRegistrationPage loginRegistrationPage;
    private HomePage homePage;
    private ProfilePage profilePage;
    String userEmail = "testautomation.acc@gmail.com";
    //String errorMsg = "Исправьте указанные ниже поля.";
    @BeforeMethod
    public void initLoginPage () {
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
    }



    @AfterMethod
    public void closeBrowser(){
        homePage.close();
    }

    @DataProvider(name = "userLoginTestData")
    public Object[][] createdata() {
        return new Object[][]{
                new Object[]{"Testautomation123"},
                new Object[]{"1234"}};
    }
    @Test
    public  void userLoginGenericTest(String userPassword){
        //String userPassword = "Testautomation123";
        loginRegistrationPage.open();
        homePage = loginRegistrationPage.loginUser(userEmail,userPassword);

        switch(userPassword) {
            case "Testautomation123":
                Assert.assertTrue(homePage.isPageLoaded());
                break;
            case "1234":
                Assert.assertFalse(homePage.isPageLoaded());
                break;
            default:
                break;
        }
        Assert.assertTrue(homePage.isPageLoaded());
    }

    @Test

    public void loadProfilePageTest(){
        String userPassword = "Testautomation123";
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
        loginRegistrationPage.open();
        homePage = loginRegistrationPage.loginUser(userEmail,userPassword);
        profilePage = homePage.profileClick();
        // assert that profile page is loaded
        profilePage.close();
    }
}

