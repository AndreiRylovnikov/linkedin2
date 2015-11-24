package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailMailPage {

    protected WebDriver driver;
    public GmailMailPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = ".//a[contains(text(),'здесь')]")
    private WebElement recoveryLink;

    public NewPasswordPage clickRecoveryLink(){
        recoveryLink.click();
        //String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);}
        return PageFactory.initElements(driver, NewPasswordPage.class);}
}
