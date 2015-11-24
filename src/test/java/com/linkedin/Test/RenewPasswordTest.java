package com.linkedin.Test;


import com.linkedin.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RenewPasswordTest {
    private LoginRegistrationPage loginRegistrationPage;
    private RestorePasswordPage restorePasswordPage;
    private GmailLoginPage gmailLoginPage;
    private GmailHomePage gmailHomePage;
    private GmailMailPage gmailMailPage;
    private NewPasswordPage newPasswordPage;

    String userRestoreEmail = "rylovnikov.a@gmail.com";
    String userPassword = "dron1111";
    String newPassword = "dron222";

    @BeforeMethod
    public void initLoginPage () {
        loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
    }


    @Test
    public void reNewPassword(){
        loginRegistrationPage.open();
        restorePasswordPage = loginRegistrationPage.forgotPassword();
        restorePasswordPage.wait2();
        restorePasswordPage.restorePasswordPage(userRestoreEmail);
        restorePasswordPage.clickRestorePasswordButton();
        gmailLoginPage = restorePasswordPage.openGmail();
        gmailHomePage = gmailLoginPage.enterEmailAndSubmt(userRestoreEmail, userPassword);
        gmailMailPage = gmailHomePage.clickMail();
        newPasswordPage = gmailMailPage.clickRecoveryLink();
        newPasswordPage.wait3();
        newPasswordPage.clickAndSubmitNewPassword(newPassword);


        }
    }
