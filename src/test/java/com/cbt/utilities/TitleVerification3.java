package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com/" ,
                "https://westelm.com/");


        System.out.println("Is Url contains title");
        for (String each: urls ) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);
            if(each.contains(driver.getTitle().replace(" ", "").toLowerCase())){
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
                System.out.println("url = " + each);
                System.out.println("title =" + driver.getTitle());
            }
            driver.quit();

        }
    }
}