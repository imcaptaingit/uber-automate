package com.uber.pages;

import com.uber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


/**
 * Author - SarvaT Shaikh
 * Project Name: uber-automate
 */

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Accept')]")
    WebElement acceptingCookies;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Products']")
    WebElement clickProducts;

    public void AcceptCookies(){
        clickOnElement(acceptingCookies);
    }
    public void clickProducts(){
        clickOnElement(clickProducts);
    }
}
