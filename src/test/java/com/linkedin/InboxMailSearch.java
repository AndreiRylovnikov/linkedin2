package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Андрей on 08.11.2015.
 */
public class InboxMailSearch {
    @Test
    public static void emailConfirmation() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("rylovnikov.a@gmail.com");
        driver.findElement(By.id("next")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Passwd")).sendKeys("dron1111");
        driver.findElement(By.id("signIn")).click();


        driver.findElement(By.xpath(".//*[@id='gs_taif50']")).sendKeys("linkedin");


    }

}

