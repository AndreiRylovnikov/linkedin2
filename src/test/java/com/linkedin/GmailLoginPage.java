package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage {

    protected WebDriver driver;
    public GmailLoginPage(WebDriver driver) {
        this.driver = driver;
        }

    @FindBy(xpath = ".//*[@id='Email']")
    private WebElement inputEmail;

    @FindBy (xpath = ".//*[@id='next']")
    private  WebElement nextButton;


    public void enterEmailAndSubmt(String userRestoreEmail){
        inputEmail.sendKeys(userRestoreEmail);
        nextButton.click();
    }

}
