package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    @Test
    public void dropdown_task5() throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://practice.cybertekschool.com/dropdown
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/dropdown");

        // we located the dropdown and it is ready to use
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.deselectByValue("VA");

        //5. Select California

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
    }

}
