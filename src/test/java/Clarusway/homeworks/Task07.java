package Clarusway.homeworks;

import Clarusway.utilities.JSUtils;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Clarusway.utilities.JSUtils.*;

public class Task07 extends TestBase{
    //Go to URL: https://www.amazon.com/
//Scroll in to view Amazon Ignite WebElement.
//Scroll up search area WebElement.
//Then flashing the background color.

    @Test
    public void test() throws InterruptedException {

        //Go to URL: https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Scroll in to view Back To Top WebElement.
        WebElement backToTop = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
        scrollIntoViewJS(backToTop);

        //Scroll up search area WebElement.
        scrollAllUpByJS();

        //Then flashing the background color.
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        flash(searchBox);

    }

}