package CodeChallangeTestNG.tests;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_Shadow extends TestBase {
      /*
    https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html adresine git
    "Hello Shadow DOM" yazısını doğrulayın

    */

    @Test
    public void test(){

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");

        WebElement content = driver.findElement(By.xpath("//div[@id='content']"));

       SearchContext shadow = content.getShadowRoot();

       WebElement title = shadow.findElement(By.cssSelector("p"));

        Assert.assertTrue(title.getText().equals("Hello Shadow DOM"));
        //2. yol jse ile çözüm

        //   JavascriptExecutor js = (JavascriptExecutor) driver;
//WebElement shadowRoot = (WebElement) js.executeScript("return document.querySelector('your-shadow-host').shadowRoot");

    }
}
