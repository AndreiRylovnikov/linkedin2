package com.linkedin;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.Test;

        import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.findElement(By.xpath(".//*[@id='gs_taif50']")).sendKeys("linkedin");
        driver.findElement(By.id(":3w")).click();


    }
}

