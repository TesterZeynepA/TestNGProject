package CodeChallangeTestNG.tests;

import Clarusway.utilities.TestBase;
import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class C04_WebTables extends TestBase {
//https://www.way2automation.com/angularjs-protractor/webtables/
    //tüm E-mail leri yazdırın
    //Tüm E-maillerin "@" işareti içerdiğini doğrulayin

    @Test
    public void WebTablesTest(){
        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");

        List<WebElement> emails = driver.findElements(By.xpath("//table/tbody/tr/td[7]"));

        for (int i = 0; i < emails.size(); i++) {

            System.out.println("emails.get(i).getText() = " + emails.get(i).getText());

            Assert.assertTrue(emails.get(i).getText().contains("@"));
        }



    }
}
