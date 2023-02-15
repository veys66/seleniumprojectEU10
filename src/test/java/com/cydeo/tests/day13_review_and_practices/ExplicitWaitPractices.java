package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    }

    @Test
    public void remove_button_test(){
        //3- Click to “Remove” button
        //4- Wait until “loading bar disappears”
        //5- Verify:
        //a. Checkbox is not displayed
        //b. “It’s gone!” message is displayed.
        //
    }
}
