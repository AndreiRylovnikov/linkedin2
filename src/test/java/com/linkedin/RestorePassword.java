package com.linkedin;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RestorePassword {
   private LoginRegistrationPage restorePassword;
    @Test
    public void restorePasswordMethod(){
        restorePassword = PageFactory.initElements(new FirefoxDriver(),LoginRegistrationPage.class);
        restorePassword.open();
        restorePassword.forgotPassword();
        restorePassword.enterEmailToRestore();



    }
}
