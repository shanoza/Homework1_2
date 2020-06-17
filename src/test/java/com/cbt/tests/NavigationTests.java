package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
public class NavigationTests {
    static WebDriver driver;

    public static void chromeTest() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);
        driver.navigate().forward();
        String title4 = driver.getTitle();
        StringUtility.verifyEquals(title2, title4);

        driver.quit();
    }

    public static void firefoxTest() {
        driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title, title3);
        StringUtility.verifyEquals(title2, title4);

        driver.quit();

    }

    public static void edgeTest() {
        driver = BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3 = driver.getTitle();
        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title, title3);
        StringUtility.verifyEquals(title2, title4);

        driver.quit();
    }


    public static void main(String[] args) {
        chromeTest();
        firefoxTest();
        edgeTest();

    }

}
