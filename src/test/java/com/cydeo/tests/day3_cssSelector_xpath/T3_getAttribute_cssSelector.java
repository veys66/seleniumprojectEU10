package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //WebElement signButton= driver.findElement(By.className("login-btn"));
        //LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES
        //                    tagname[attribute='value']
        //                     input[class='login-btn']

        //LOCATED USING CLASS ATTRIBUTE
        //WebElement signButton= driver.findElement(By.cssSelector("input[class='login-btn']"));

        //LOCATED USING TYPE ATTRIBUTE
        //WebElement signButton= driver.findElement(By.cssSelector("input[type='submit']"));

        //LOCATED USING VALUE ATTRIBUTE
        WebElement signButton= driver.findElement(By.cssSelector("input[value='Log In']"));










    }

}
