package com.linkedin;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationWithExistingData {

    private LoginRegistrationPage registrationPage;
    @Test
    public  void registration(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
        registrationPage.open();
        registrationPage.submitRegistrationForm("TestAutomation","Account","testautomation.acc@gmail.com", "Testautomation123");



    }

}

