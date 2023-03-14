package clarusway.tests.UmıtPractıes;

import org.testng.annotations.Test;

public class Day_01_C05_TimeOut {


    @Test(timeOut = 1000
    )
    public void passedTest(){
        System.out.println("1 saniyeden once calisti");



    }


    @Test(timeOut = 1000)
    public void timedOutTest() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Bir saniyeden sonra calisti");



    }






}
