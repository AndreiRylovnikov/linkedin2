package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class NewPasswordPage {

    protected WebDriver driver;
    public NewPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='new_password-newPassword-passwordReset']")
    private WebElement inputNewPassword;

    @FindBy(xpath = "//input[@id='new_password_again-newPassword-passwordReset']")
    private WebElement confirmInputNewPassword;

    @FindBy(xpath = "//input[@id='reset']")
    private WebElement submitNewPassword;

    public void  clickAndSubmitNewPassword(String newPassword){
        inputNewPassword.sendKeys(newPassword);
        confirmInputNewPassword.sendKeys(newPassword);
        submitNewPassword.click();
    }
    public void wait3(){driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}


}
