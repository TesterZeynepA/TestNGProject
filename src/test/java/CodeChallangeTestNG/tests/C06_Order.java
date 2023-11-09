package CodeChallangeTestNG.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C06_Order {
    /*
   https://bonigarcia.dev/selenium-webdriver-java/navigation1.html adresine git
   Navigation example "Lorem ipsum" içermeli
   2 butonuna tıkla
   Navigation example "Ut enim" içermeli
   3 butonuna tıkla
   Navigation example "Excepteur sint" içermeli

   */
    WebDriver driver;
    //extent kullanma.......
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }
    @Test(priority = 1)
    public void test1(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/navigation1.html");
        assertBodyContains("Lorem ipsum");

    }
    @Test(priority = 2)
    public void test2(){
        driver.findElement(By.linkText("2")).click();
        assertBodyContains("Ut enim");
    }
    @Test(priority = 3)
    public void test3(){
        driver.findElement(By.linkText("3")).click();
        assertBodyContains("Excepteur sint");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    void assertBodyContains(String text) {
        String bodyText = driver.findElement(By.xpath("//p[@class='lead']")).getText();
        Assert.assertTrue(bodyText.contains(text));
    }
}
