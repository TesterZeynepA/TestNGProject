package Clarusway.homeworks;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class Task05 extends TestBase {
    //http://the-internet.herokuapp.com/add_remove_elements/ sitesine gidiniz
//istenilen sayi kadar add element butonuna tıklayiniz, ve bu sayiyi xml de parametre olarak belirtiniz..
//eklenen element sayisini test ediniz
//testNg listenerlarini xml de konfigure ediniz (EmailableReporter, FailedReporter)

    @Test
    @Parameters("clickCount")
    public void test(int clickCount){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        for (int i = 0; i < clickCount; i++) {

            addElement.click();
        }

        List<WebElement> listElements = driver.findElements(By.xpath("//button[@class='added-manually']"));
        Assert.assertEquals(listElements.size(), clickCount);

    }
}
