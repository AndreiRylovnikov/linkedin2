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

import java.sql.Driver;

public class LoginTests {

    private LoginRegistrationPage loginRegistrationPage;
    private HomePage homePage;
    private ProfilePage profilePage;
    private FirefoxDriver driver;
    String userEmail = "testautomation.acc@gmail.com";
    String pageTitle = "Добро пожаловать! | LinkedIn";


    @BeforeMethod
    public void setup() {
        this.driver = new FirefoxDriver();
        loginRegistrationPage = new LoginRegistrationPage(driver);
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
        homePage = loginRegistrationPage.loginUser(userEmail,userPassword);
        switch(userPassword) {
            case "Testautomation123":
                Assert.assertTrue(homePage.isPageLoaded(pageTitle));
                break;
            case "1234":
                Assert.assertFalse(homePage.isPageLoaded(pageTitle));
                break;
            default:
                break;
        }
        Assert.assertTrue(homePage.isPageLoaded(pageTitle));
    }

    @Test

    public void loadProfilePageTest(){
        String userPassword = "Testautomation123";
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
        loginRegistrationPage.open();
        homePage = loginRegistrationPage.loginUser(userEmail,userPassword);
        profilePage = homePage.profileClick();
        profilePage.close();
    }
}

