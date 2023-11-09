package Clarusway.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;


public class C29_UseListenersWithXml {
    //3.Yöntem
    //Listeners classıyla Test classımızı XmlFile sayesinde <listeners> tagiyle yapıyoruz.


    @Test
    public void successfulTest(){
        Assert.assertEquals(1,1);

    }

    @Test
    public void failedTest(){
        Assert.assertEquals(1,2);
    }


    @Test
    public void successTest(ITestContext context){
        System.out.println(context.getFailedTests().size());//1
        Assert.assertEquals(1,1);
        context.setAttribute("data",10);
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }
}
