package com.linkedin;


import com.linkedin.Test.LoginTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RestorePasswordPage extends LoginTests {

    protected WebDriver driver;

    public RestorePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='email-requestPasswordReset']")
    private WebElement requestPasswordResetButton;

    @FindBy(xpath = ".//input[@id='request']")
    private WebElement submitRestoringPassword;

    public void restorePasswordPage(String userRestoreEmail) {
        requestPasswordResetButton.sendKeys(userRestoreEmail);
    }


    public void clickRestorePasswordButton() {
        submitRestoringPassword.click();
    }


    public void wait2(){driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}



    public GmailLoginPage openGmail(){ driver.get("https://www.gmail.com");
        return PageFactory.initElements(driver, GmailLoginPage.class);}
    }


