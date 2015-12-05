package com.linkedin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class SearchPage {
    protected WebDriver driver;

    public SearchPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (xpath = ".//*[@id='advs-keywords']")
    WebElement keyWord;

    @FindBy (xpath = ".//*[@name='submit']")
    WebElement submitSearchButton;

    @FindBy (xpath = ".//*[@class='result-image']")
    List<WebElement> result;


    public void findForKeyWord(String hr){
        keyWord.sendKeys(hr);
        submitSearchButton.submit();
    }

    public List<WebElement> resultImage(){
        driver.
    }



    public void waitPage(){driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
}
