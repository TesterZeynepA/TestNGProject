package Clarusway.test;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C10_SoftAssertion extends TestBase {
//Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //Puch Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!

    @Test
    public void negativeUserNameTestSoft(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("incorrectUser");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        SoftAssert softAssert = new SoftAssert();

        WebElement errorMessage= driver.findElement(By.xpath("//div[@id='error']"));

        softAssert.assertTrue(errorMessage.isDisplayed());

        softAssert.assertEquals("Your username is invalid!", errorMessage.getText());

        softAssert.assertAll();

    }
}
