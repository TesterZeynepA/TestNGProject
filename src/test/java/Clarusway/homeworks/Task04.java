package Clarusway.homeworks;

import Clarusway.utilities.ParameterBrowserTestBase;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task04 extends ParameterBrowserTestBase {
    //Go to URL: http://crossbrowsertesting.github.io/
    //Click to To-Do App
    //Checking Box to do-4 and Checking Box to do-5
    //If both clicks worked, then the following List should be have length 2.
    //Assert that this is correct
    //Assert that the to do we added is present in the list
    //Archiving old todos
    //If our archive link worked, then the following list should have length 4.
    //Assert that this is true as well
    //Doing Cross Browser Testing.

    @Test
    public void test() throws InterruptedException {

        //Go to URL: http://crossbrowsertesting.github.io/
        driver.get("http://crossbrowsertesting.github.io/");

        //Click to To-Do App
        driver.findElement(By.xpath("//*[contains(text(),'To-Do App')]")).click();

        Thread.sleep(3000);

        //Checking Box to do-4 and Checking Box to do-5
        WebElement checkBox4= driver.findElement(By.xpath("//input[@name='todo-4']"));
        checkBox4.sendKeys(Keys.SPACE);

        WebElement checkBox5= driver.findElement(By.xpath("//input[@name='todo-5']"));
        checkBox5.sendKeys(Keys.SPACE);

        //If both clicks worked, then the following List should be have length 2.
        //Assert that this is correct
        int listSize = driver.findElements(By.xpath("//span[@class='done-true']")).size();
        Assert.assertEquals(listSize, 2);

        //Assert that the to do we added is present in the list
        WebElement addNewToDo= driver.findElement(By.xpath("//input[@id='todotext']"));
        addNewToDo.sendKeys("Run the tests in parallel"+Keys.ENTER);

        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Run the tests in parallel')]")).isDisplayed());

        //Archiving old todos
        WebElement archive= driver.findElement(By.xpath("//a[contains(text(),'archive')]"));
        archive.click();

        //If our archive link worked, then the following list should have length 4.
        //Assert that this is true as well
        int archiveList = driver.findElements(By.xpath("//span[@class='done-false']")).size();

        Assert.assertEquals(archiveList, 4);

        //Doing Cross Browser Testing.

    }
}
