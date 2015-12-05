package com.linkedin.Test;


import com.linkedin.HomePage;
import com.linkedin.LoginRegistrationPage;
import com.linkedin.SearchPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTest {
    private LoginRegistrationPage loginRegistrationPage;
    private HomePage homePage;
    private SearchPage searchPage;

    String userEmail = "rylovnikov.a@gmail.com";
    String userPassword = "dron1111";
    String hr = "HR";

    @BeforeMethod
    public void initLoginPage () {
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
    }

   @Test
    public void test(){
       loginRegistrationPage.open();
       homePage = loginRegistrationPage.loginUser(userEmail,userPassword);
       searchPage = homePage.searchClick();
       searchPage.waitPage();
       searchPage.findForKeyWord(hr);
       searchPage.waitPage();
       List<WebElement> al = new ArrayList<WebElement>();

       al = searchPage.resultImage();

       for(int i=0; i<al.size();i++){
           al.get(i).click();



   }
}
