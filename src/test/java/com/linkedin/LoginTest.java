package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit; //fgfgfgfgfg

public class LoginTest {
    @Test
    public static void errorOnLoginWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com");
        driver.findElement(By.id("login-email")).sendKeys("rylovnikov.a@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[text()='Проверка безопасности']"));
        Assert.assertTrue(errorMessage.isDisplayed(),"Element is not Displayed");


    }

}
/*driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        if(driver.getPageSource().contains("При заполнении формы были допущены ошибки. Проверьте и исправьте отмеченные поля."))
        {
        System.out.println("Pass");
        }
        else
        {
        System.out.println("Fail");
        }
        driver.close();*/