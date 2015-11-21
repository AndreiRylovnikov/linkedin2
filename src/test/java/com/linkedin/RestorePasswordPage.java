package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestorePasswordPage {

    protected WebDriver driver;

    public RestorePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='email-requestPasswordReset']")
    private WebElement requestPasswordResetButton;

    public restorePasswordPage (){requestPasswordResetButton.sendKeys();

}
