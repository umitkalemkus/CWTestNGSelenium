package UmitPractise;

import org.testng.annotations.Test;

public class TimeOut {


    @Test(timeOut = 1000)
    public void passedTest() {
        System.out.println("1 saniyeden once calisti");



    }


    @Test(timeOut = 1000)
    public void timeOutTest() throws InterruptedException {

        System.out.println("1 saniyeden sonra calisti");

        Thread.sleep(2000); /// hata verdi sonraki kodlar calismaz

        System.out.println("1 saniyeden sonra calisti");




    }









}
