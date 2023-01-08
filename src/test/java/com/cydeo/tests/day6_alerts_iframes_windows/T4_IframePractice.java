package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }

    //@Ignore
    @Test
    public void iframe_test(){

        //We need to switch driver's focus to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //Locate the p tag
        WebElement yourContentGoesHereText= driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify “An iFrame containing the TinyMCE WYSIWYG Editor”
        //To able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText= driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed on page
        Assert.assertTrue(headerText.isDisplayed());



    }

}
