package Clarusway.homeworks;

import Clarusway.utilities.ExcelUtil;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task06 extends TestBase {
    //Go to URL: http://crossbrowsertesting.github.io/login-form.html
    // Login with credentials by using ExcelUtils
    //Username: tester@crossbrowsertesting.com
    //Password: test123

    @Test
    public void test(){
        driver.get("http://crossbrowsertesting.github.io/login-form.html");

        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));

        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));

        username.sendKeys("tester@crossbrowsertesting.com");

        password.sendKeys("test123");

        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("logged-in"));

        Assert.assertTrue(loginMessage.isDisplayed());

    }
}
