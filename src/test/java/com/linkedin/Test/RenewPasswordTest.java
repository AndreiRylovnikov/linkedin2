package com.linkedin.Test;

import com.linkedin.GmailLoginPage;
import com.linkedin.LoginRegistrationPage;
import com.linkedin.RestorePasswordPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RenewPasswordTest {
    private LoginRegistrationPage loginRegistrationPage;
    private RestorePasswordPage restorePasswordPage;
    private GmailLoginPage gmailLoginPage;
    String userRestoreEmail = "rylovnikov.a@gmail.com";

    @BeforeMethod
    public void initLoginPage () {
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
    }

    @Test
    public void reNewPassword(){
        loginRegistrationPage.open();
        restorePasswordPage = loginRegistrationPage.forgotPassword();
        restorePasswordPage.restorePasswordPage(userRestoreEmail);
        restorePasswordPage.clickRestorePasswordButton();
        restorePasswordPage.openGmail();
       //gmailLoginPage = restorePasswordPage.enterEmail







    }
}
