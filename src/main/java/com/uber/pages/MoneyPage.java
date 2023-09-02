package com.uber.pages;

import com.uber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Author - Sarvat Shaikh
 * Project Name: uber-automate
 */
public class MoneyPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Money')]")
    WebElement clickMoney;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Use our API']")
    WebElement clickOnUseOurApi;

    public void clickMoney() {
        clickOnElement(clickMoney);
    }

    public void clickApi() {
        clickOnElement(clickOnUseOurApi);
    }
}
