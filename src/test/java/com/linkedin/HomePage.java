package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
//    public boolean isPageLoaded(){
//        if (driver.getTitle().contentEquals("Добро пожаловать! | LinkedIn")){
//            return true;
//        }
//        return false;
//    }
    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    WebElement profileMenuLink;

    @FindBy (xpath = ".//*[@id='advanced-search']")
    WebElement search;

    public SearchPage searchClick(){
        search.click();
        return PageFactory.initElements(driver, SearchPage.class);
    }

    public ProfilePage profileClick(){
        profileMenuLink.click();
    return PageFactory.initElements(driver, ProfilePage.class);
    }
    public void close() { driver.quit();}


}
