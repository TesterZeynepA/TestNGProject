package Clarusway.homeworks;

import Clarusway.utilities.JSUtils;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task07 extends TestBase{
    //Go to URL: https://www.amazon.com/
//Scroll in to view Amazon Ignite WebElement.
//Scroll up search area WebElement.
//Then flashing the background color.

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");

        WebElement amazonIgnite = driver.findElement(By.xpath("//a[@aria-label='Amazon US Home']"));

       // Thread.sleep(3000);
       // JSUtils.scrollIntoViewJS(amazonIgnite);

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

       // JSUtils.scrollAllUpByJS();

        JSUtils.flash(searchBox);






    }
}
