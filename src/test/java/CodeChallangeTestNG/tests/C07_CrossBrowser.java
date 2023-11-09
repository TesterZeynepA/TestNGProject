package CodeChallangeTestNG.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C07_CrossBrowser {
    /*
        https://bonigarcia.dev/selenium-webdriver-java/ adresine git
        farklı Browserlar için();
        Title'in "Selenium WebDriver" icerdigini dogrula
        */
/*
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.4.1</version>
    </dependency>
*/
    WebDriver driver;
    @DataProvider(name = "browsers")
    public static Object[][] data() {
        return new Object[][] { { "chrome" }, { "safari" }, { "firefox" } };
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
    @Test(dataProvider ="browsers" )
    public void test(String browserName){
        driver= WebDriverManager.getInstance(browserName).create();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"));
    }
}
