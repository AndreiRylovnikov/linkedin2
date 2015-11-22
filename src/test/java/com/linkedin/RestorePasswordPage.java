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

    @FindBy(xpath = ".//input[@id='request']")
    private WebElement submitRestoringPassword;

    public void restorePasswordPage(String userRestoreEmail) {
        requestPasswordResetButton.sendKeys(userRestoreEmail);
    }
    public GmailLoginPage clickRestorePasswordButton(){
        submitRestoringPassword.click();
        return PageFactory.initElements(driver, GmailLoginPage.class);};
    public void openGmail(){ driver.get("https://www.gmail.com");
    }
}

