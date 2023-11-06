package Clarusway.homeworks;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task02 extends TestBase {
    /*
    //Go to URL: https://opensource-demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ''Invalid credentials'’ is displayed.
     */

    @Test(dataProvider = "invalidCredentials")
    public void test(String username, String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText().contains("Invalid credentials"));

    }

    @DataProvider(name = "invalidCredentials")
    public Object[][] invalidCredentials() {

        Object [][] data = new Object[][] {{"admine", "admine321"},{"username", "password"},{"isimsiz", "parolasız"}};
        return data;
    }

}
