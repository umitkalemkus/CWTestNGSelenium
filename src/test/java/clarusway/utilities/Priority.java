package clarusway.utilities;

import org.testng.annotations.Test;

public class Priority {


    @Test(priority = 5)
    public void test1() {


        System.out.println("1. test calisti");

    }



    @Test(priority = -3 )
    public void test2() {

        System.out.println("2. test calisti");


    }



    @Test(priority = 345)
    public void test3() {

        System.out.println("3. test calisti");


    }








}
