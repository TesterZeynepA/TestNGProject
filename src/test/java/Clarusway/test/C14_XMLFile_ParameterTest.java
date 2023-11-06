package Clarusway.test;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C14_XMLFile_ParameterTest extends TestBase {

    //Go to URL: https://www.amazon.com
    //Search words: Java, Selenium
    //Assert get text result test that the result text contains the searched Word.
    //Run tests from XML file.

    @Test
    public void test(){
        driver.get("http://www.amazon.com");

        WebElement searchArea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchArea.sendKeys("Java"+ Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));

        Assert.assertTrue(result.getText().contains("java"));



    }

}
