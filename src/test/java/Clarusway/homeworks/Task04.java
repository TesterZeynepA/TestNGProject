package Clarusway.homeworks;

import Clarusway.utilities.TestBase;
import org.testng.annotations.Test;

public class Task04 extends TestBase {
    //Go to URL: http://crossbrowsertesting.github.io/
//Click to To-Do App
//Checking Box to do-4 and Checking Box to do-5
//If both clicks worked, then the following List should be have length 2.
//Assert that this is correct
//Assert that the to do we added is present in the list
//Archiving old todos
//If our archive link worked, then the following list should have length 4.
//Assert that this is true as well
//Doing Cross Browser Testing.

    @Test
    public void test(){
        driver.get("http://crossbrowsertesting.github.io/");


    }
}
