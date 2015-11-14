package com.linkedin;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {

    private RegistrationPage loginPage;
    @Test
    public  void loginProcess(){
        loginPage = PageFactory.initElements(new FirefoxDriver(), RegistrationPage.class);
        loginPage.open();
        loginPage.submitLoginForm("testautomation.acc@gmail.com", "Testautomation123");
        loginPage.enter();

    }
}

