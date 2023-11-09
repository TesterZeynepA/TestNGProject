package Clarusway.test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C26_AllureTest {

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test1(){
        Assert.assertTrue(true);
        System.out.println("testcase1 doğru şekilde çalışmıştır");
    }

    @Severity(SeverityLevel.NORMAL)
    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println("testcase2 doğru şekilde çalışmıştır");
    }

    @Description("skip this test")
    @Test
    public void test3(){
        throw new SkipException("test 3 skip edilecek");
    }

    @Description("skip this test")
    @Test
    public void test4(){
        throw new SkipException("test 4 skip edilecek");
    }
}
