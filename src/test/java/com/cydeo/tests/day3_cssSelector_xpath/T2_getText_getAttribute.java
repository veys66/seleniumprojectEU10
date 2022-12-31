package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes






    }
}
