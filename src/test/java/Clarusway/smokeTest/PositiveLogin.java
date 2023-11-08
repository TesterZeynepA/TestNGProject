package Clarusway.smokeTest;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PositiveLogin extends TestBase {

      /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
     */

    @Test
    public void testLoginHard() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Congratulations student. You successfully logged in!')]")).getText().contains("Congratulations")||
                driver.findElement(By.xpath("//*[contains(text(),'Congratulations student. You successfully logged in!')]")).getText().contains("successfully logged in"));

        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed());
    }

    @Test
    public void testLoginSoft() {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();


        SoftAssert softAssert = new SoftAssert();
       softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Congratulations student. You successfully logged in!')]")).getText().contains("Congratulations")||
                driver.findElement(By.xpath("//*[contains(text(),'Congratulations student. You successfully logged in!')]")).getText().contains("successfully logged in"));

        softAssert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).isDisplayed());

        softAssert.assertAll();
    }
}
