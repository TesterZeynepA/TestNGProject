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
    public void loginTest() {

        driver.get("http://crossbrowsertesting.github.io/login-form.html");

        WebElement usernameBox= driver.findElement(By.xpath("//input[@name='username']"));

        WebElement passwordBox= driver.findElement(By.xpath("//input[@name='password']"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));

        String excelPath = "C:\\Users\\zeyne\\IdeaProjects\\TestNGProject\\src\\test\\resources\\testData.xlsx";
        String sheetName = "Login";

        ExcelUtil excelUtil = new ExcelUtil(excelPath, sheetName);
        String username = excelUtil.getCellData(0, 0);
        String password = excelUtil.getCellData(0, 1);

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("logged-in"));
        Assert.assertTrue(loginMessage.isDisplayed());

    }

}
