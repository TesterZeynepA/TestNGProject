package Clarusway.test;

import Clarusway.utilities.TestBase;
import org.testng.annotations.Test;

public class C23_ParallelTestParameter {

    @Test(threadPoolSize = 4, invocationCount = 8, timeOut = 1000)
    public void test1(){
        System.out.println(" thread id : "+Thread.currentThread().getId());


    }
}
