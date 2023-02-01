package com.cydeo.tests.assesment;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ToDoTest {

    @Test
    public void todo_test(){
        Driver.getDriver().get("https://todomvc.com/");

        //# Click within the Javascript tab and select the Polymer link
        WebElement javascript= Driver.getDriver().findElement(By.xpath("//div[text()='JavaScript']"));
        javascript.click();

        WebElement polymerLink= Driver.getDriver().findElement(By.xpath("//a[text()='Polymer']"));
        polymerLink.click();

        //# Add two Todo items
        WebElement todo1= Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        todo1.sendKeys("Two Milk"+ Keys.ENTER);

        WebElement todo2= Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        todo2.sendKeys(" A Bread"+ Keys.ENTER);

        //# Edit the content second Todo item (Optional)
        BrowserUtils.sleep(2);
        WebElement editContent= Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
        editContent.click();

        BrowserUtils.sleep(2);
        WebElement editContent2= Driver.getDriver().findElement(By.xpath("(//button[@class='destroy style-scope td-item'])[2]"));
        editContent2.click();

        todo2.sendKeys("Hurry Up!"+Keys.ENTER);
    }
}
