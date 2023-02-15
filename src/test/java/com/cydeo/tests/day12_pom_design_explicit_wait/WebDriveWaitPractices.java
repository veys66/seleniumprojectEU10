package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriveWaitPractices {

    @Test
    public void dynamic_load_7_test(){
        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”

        //creating wait object to be able to create certain condition to wait
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);

        //use the "wait" object to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //Create object of DynamicLoad7Page to reach and assert web elements
        DynamicLoad7Page dynamicLoad7Page= new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //4. Assert: Image is displayed.


    }


}
