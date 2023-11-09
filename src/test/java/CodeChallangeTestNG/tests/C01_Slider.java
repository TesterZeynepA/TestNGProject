package CodeChallangeTestNG.tests;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import static java.lang.invoke.MethodHandles.lookup;
import static java.util.logging.Logger.getLogger;

public class C01_Slider extends TestBase {

    static final Logger log = getLogger(String.valueOf(lookup().lookupClass()));
    /*
    https://bonigarcia.dev/selenium-webdriver-java/web-form.html adresine git
    Slider'ın ilk value değerini kaydet
    Slider'ı 5 birim sağ'a kaydır
    Slider'ın son value değeri kaydet
    endValue-initValue==5 olduğunu doğrula
    */
    @Test
    public void testSlider() throws InterruptedException {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        log.info("User go to url");
        WebElement slider = driver.findElement(By.xpath("//input[@name='my-range']"));
        String ilkValue=slider.getAttribute("value");
        log.info("ilk slider value = "+ilkValue);
        for (int i = 0; i <5 ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            Thread.sleep(3000);
        }
        String sonValue =slider.getAttribute("value");
        log.info("ilk slider value = "+sonValue);
        Assert.assertEquals(Integer.parseInt(sonValue) - Integer.parseInt(ilkValue), 5);
        log.info("slider testi bitti");
    }
}