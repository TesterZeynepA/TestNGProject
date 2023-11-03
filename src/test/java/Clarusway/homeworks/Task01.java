package Clarusway.homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task01 {
    /*
   Create tests that depend on each other
   Create beforeClass and set up settings.
   By creating interdependent tests;
   First go to Facebook.
   Then go to Google depending on Facebook,
   Then go to Amazon depending on Google
   Close the driver.
 */

   static WebDriver driver;
    @BeforeClass
    public static void setUp(){
     driver = new ChromeDriver();

     driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void facebook(){

     driver.get("https://www.facebook.com/");

     System.out.println("facebook sayfasına gidildi");

    }

    @Test(dependsOnMethods = {"facebook"})
    public void google(){

     driver.get("https://www.google.com/");

     System.out.println("facebook testine bağlı olarak google sayfasına gidildi");

    }

    @Test(dependsOnMethods = {"google"})
    public void amazon(){

     driver.get("https://www.amazon.com/");

     System.out.println("google testine bağlı olarak amazon sayfasına gidildi");

    }

    @AfterClass
 public static void tearDown(){
     driver.quit();

    }
}
