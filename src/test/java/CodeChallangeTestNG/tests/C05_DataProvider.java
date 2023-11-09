package CodeChallangeTestNG.tests;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C05_DataProvider extends TestBase {
    /*
    https://bonigarcia.dev/selenium-webdriver-java/login-form.html adresine git
    "user", "user", icin "Login successful"
    "bad-user", "bad-passwd",için "Invalid credentials"
 olduğunu doğrula

    */
    @Test(dataProvider = "loginData")
    public void dataP(String username, String password, String expectedText){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String bodyText=driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(bodyText.contains(expectedText));

    }

    @DataProvider
    public Object[][] loginData() {

        return new Object[][]{
                {"user","user","Login successful"},
                {"bad-user","bad-passwd","Invalid credentials"}
        };
    }
}
