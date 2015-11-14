package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationWithWrongEmail {
    private RegistrationPage registrationPage;
    @Test
    public  void securityVerifivation(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), RegistrationPage.class);
        registrationPage.open();
        registrationPage.submitRegistrationForm("first", "last", "Linkedin.tstacc@gmail.com", "P@ssword123");
        registrationPage.close();

    }
}
