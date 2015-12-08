package com.linkedin;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchPage {
    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='advs-keywords']")
    WebElement keyWord;

    @FindBy(xpath = ".//*[@name='submit']")
    WebElement submitSearchButton;

    @FindBy(xpath = ".//*[@class='title main-headline']")
    List<WebElement> result;

    public void waitPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void findForKeyWord(String hr) {
        keyWord.sendKeys(hr);
        submitSearchButton.submit();
    }


    public void testMethod() {
        int sizeOfAllLinks = result.size();
        for (int i = 0; i < sizeOfAllLinks; i++) {
            result.get(i).getAttribute("href");
        }
        for (int index = 0; index < sizeOfAllLinks; index++) {
            getElementWithIndex(By.tagName("a"), 10).click();
            driver.navigate().back();
        }
    }

    public WebElement getElementWithIndex(By by, int index) {
        WebElement element = driver.findElement(By.xpath(".//*[@class='title main-headline']"));
        List<WebElement> elements = element.findElements(By.tagName("a"));
        return elements.get(index);
    }


    public void testMethod2() {

        int al = result.size();
        WebElement element = driver.findElement(By.xpath(".//*[@class='result-image']"));
        for (int i = 0; i <= al; i++) {
            result.get(i).getAttribute("href");
            element.click();
        }
    }





    public void testMethod3() {
        List<WebElement> input_type = driver.findElements(By.xpath(".//*[@class='title main-headline']"));
        driver.findElements(By.tagName("a"));

        for (WebElement type : input_type) {


            type.click();
        }

    }

    public void testMethod4() {
        List<WebElement> all_links_webpage = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links Available: " + all_links_webpage.size());
        int k = all_links_webpage.size();
        System.out.println("List of links Available: ");
        for (int i = 0; i < k; i++) {
            if (all_links_webpage.get(i).getAttribute("href").contains("")) {
                String link = all_links_webpage.get(i).getAttribute("href");
                System.out.println(link);
            }
        }
    }
    public void testMethod5() {
        List<WebElement> elements = driver.findElements(By.xpath(".//*[@class='title main-headline']"));
        int i;
        for (i = 0; i <= elements.size() - 1; i++) {
            List<WebElement> elements2 = driver.findElements(By.xpath(".//*[@class='title main-headline']"));

            WebElement ele = elements2.get(i).findElement(By.xpath(".//*[@class='title main-headline']"));

            ele.click();
            //driver.navigate().back();
        }
    }


}

