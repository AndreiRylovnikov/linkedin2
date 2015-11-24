package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {
    protected WebDriver driver;
    public GmailHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = ".//*[@id=':3y']")
    private WebElement mail;

    public GmailMailPage clickMail(){
        mail.click();
        return PageFactory.initElements(driver, GmailMailPage.class);
    }
}
