package CodeChallangeTestNG.tests;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class C02_UploadFile extends TestBase {
 /*
    https://bonigarcia.dev/selenium-webdriver-java/web-form.html adresine git
    File input alanına bir dosya yükleyin
    Submit butonına tıklayın

    Başlangıç URL'i ile Son URL'infarklı olduğunu doğrulayın

    */

    @Test
    public void test() throws IOException {

        String ilkUrl= "https://bonigarcia.dev/selenium-webdriver-java/web-form.html";
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

        WebElement input = driver.findElement(By.xpath("//input[@name='my-file']"));

        Path tempFile = Files.createTempFile("tempfile",".tmp");//Files.createTempFile ile geçici bir dosya oluşturuyoruz.

        String filePath = tempFile.toAbsolutePath().toString();//geçici dosyanın tam yolunu elde ediyoruz.
        System.out.println("filePath = " + filePath);

        input.sendKeys(filePath);

        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        Assert.assertNotEquals(ilkUrl,driver.getCurrentUrl());

    }
}
