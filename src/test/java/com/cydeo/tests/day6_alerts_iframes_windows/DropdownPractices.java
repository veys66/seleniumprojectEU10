package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/dropdown ");
    }
    @Test
    public void dropdown_task5() throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://practice.cybertekschool.com/dropdown
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/dropdown ");

        // we located the dropdown and it is ready to use
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        String expectedOptionText="California";
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    @Test
    public void dropdown_task6(){

        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown= new Select(driver.findElement(By.xpath("")));
        Select monthDropdown= new Select(driver.findElement(By.xpath("")));
        Select dayDropdown= new Select(driver.findElement(By.xpath("")));
        //Select year using  : visible text
        //Select month using   : value attribute
        //Select day using : index number

    }

}
