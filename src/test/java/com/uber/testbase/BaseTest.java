package com.uber.testbase;


import com.uber.propertyreader.PropertyReader;
import com.uber.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
