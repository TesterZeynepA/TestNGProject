package Clarusway.homeworks;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task03 extends TestBase {
    /*
    //Open the site: http://opencart.abstracta.us/index.php?route=account/login
//Login with that credentials
//Email: clarusway@gmail.com
//Password: 123456789
//Using the Search function do it with Data Provider for Mac, iPad and Samsung.
     */

    @Test(dataProvider = "aranacakKelime")
    public void test(String keywords){
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("clarusway@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(keywords + Keys.ENTER);

    }

    @DataProvider(name = "aranacakKelime")
    public Object[][] getData2(){

        Object[][] data ={{"Mac"},{"iPad"},{"Samsung"}};
        return data;
    }
}
