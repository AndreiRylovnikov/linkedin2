package com.linkedin;

import com.linkedin.Test.LoginTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginRegistrationPage extends LoginTests {
    protected WebDriver driver;
    public LoginRegistrationPage(WebDriver driver) {
        //PageFactory.initElements(driver, this);
        this.driver = driver;
    }
        //Registration Elements
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "join-email")
    private WebElement emailInput;

    @FindBy(id = "join-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement joinButton;

        //Login Elements
    @FindBy (id = "login-email")
    private WebElement loginEmailInput;

    @FindBy (id = "login-password")
    private WebElement loginPasswordInput;

    @FindBy (xpath = "//input[@name='submit']")
    private WebElement loginSubmitButton;
                //Other
    @FindBy (xpath = ".//*[@class='password-wrapper']/a")
    private WebElement forgotPasswordButton;

    @FindBy (xpath = "//div/[@class='alert error']//strong")
    private WebElement alertErrorMessage;

    public String getAlertErrorMessageText(){
        return alertErrorMessage.getText();
    }

    public void submitRegistrationForm(String firstName, String lastName, String email, String password){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        joinButton.click();
    }

    public HomePage loginUser (String userEmail, String userPassword){
        loginEmailInput.sendKeys(userEmail);
        loginPasswordInput.sendKeys(userPassword);
        loginSubmitButton.click();
        return PageFactory.initElements(driver, HomePage.class);

    }

    public void open(){ driver.get("https://www.linkedin.com");
        //return PageFactory.initElements( driver, LoginRegistrationPage.class);
    };

    public void enter(){ loginSubmitButton.click();}

    public RestorePasswordPage forgotPassword(){forgotPasswordButton.click();
        return PageFactory.initElements(driver, RestorePasswordPage.class);}


}



