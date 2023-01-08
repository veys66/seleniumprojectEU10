package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_window_test(){

        //Storing the main page's window handle as string is
        //good practice for future re-usable purposes
        String mainHandle=driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);


    }




}
