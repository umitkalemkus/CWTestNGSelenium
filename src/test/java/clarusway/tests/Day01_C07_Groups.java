package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C07_Groups {

    // Bu groups attributu sayesinde biz istedigimiz gruplara sahip test caselerini ozel olarak calistirabiliriz.

    @Test(groups = {"smoke","regression"})
    public void loginTest() {


    }

    @Test(groups = {"regression"})
    public void aboutTest() {


    }


    @Test(groups = {"regression"})
    public void contactTest() {



    }
    @Test(groups = {"regression","smoke"})
    public void registrationsTest() {



    }

    @Test(groups = {"regression","smoke"})
    public void checkoutTest() {
        System.out.println();


    }
}
