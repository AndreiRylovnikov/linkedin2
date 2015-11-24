package com.linkedin;


import com.linkedin.Test.LoginTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage extends LoginTests{

    protected WebDriver driver;
    public GmailLoginPage(WebDriver driver) {
        this.driver = driver;
        }

    @FindBy(xpath = ".//*[@id='Email']")
    private WebElement inputEmail;

    @FindBy (xpath = ".//*[@id='next']")
    private  WebElement nextButton;

    @FindBy(xpath = ".//*[@id='Passwd']")
    private WebElement inputPassword;

    @FindBy (xpath = ".//*[@id='signIn']")
    private  WebElement signinButton;


    public GmailHomePage enterEmailAndSubmt(String userRestoreEmail, String  userPassword) {
        inputEmail.sendKeys(userRestoreEmail);
        nextButton.click();
        inputPassword.sendKeys(userPassword);
        signinButton.click();
        return PageFactory.initElements(driver, GmailHomePage.class);}

    }


