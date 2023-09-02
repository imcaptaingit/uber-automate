package com.uber.testsuite;

import com.uber.customlisteners.CustomListeners;
import com.uber.pages.HomePage;
import com.uber.pages.MoneyPage;
import com.uber.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {
    HomePage homePage;
    MoneyPage moneyPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        moneyPage = new MoneyPage();
    }

    @Test
    public void test001() {
        homePage.AcceptCookies();
        homePage.clickProducts();
        moneyPage.clickMoney();
        moneyPage.clickApi();
    }

}
