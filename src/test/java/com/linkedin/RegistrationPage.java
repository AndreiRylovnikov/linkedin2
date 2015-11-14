package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Login {
    protected WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

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

    @FindBy (id = "login-email")
    private WebElement emailLoginInput;

    @FindBy (id = "login-password")
    private WebElement passwordLoginInput;

    public void submitRegistrationForm(String firstName, String lastName, String email, String password){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        joinButton.click();
    }

    public void submitLoginForm(String emailLogin, String passwordLogin){
        emailLoginInput.sendKeys(emailLogin);
        passwordLoginInput.sendKeys(passwordLogin);
    }

    public void open(){ driver.get("https://www.linkedin.com");}
    public void close() { driver.quit();}
    public void enter(){ driver.findElement(By.xpath("//input[@name='submit']")).click();}
    Boolean isPresent = driver.findElements(By.xpath("xpath=(//a[contains(text(),'Profile')])[2]")).size() > 0;}

