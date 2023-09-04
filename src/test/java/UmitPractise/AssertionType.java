package UmitPractise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionType {

    @Test
    public void hardAssertion() {


        System.out.println("Assersion oncesi calisiyor");
        Assert.assertEquals(1,2 , "esit degildir");
        System.out.println("Assersion sonrasi calisiyor");
    }

    @Test
    public void softAssertion() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Assersion oncesi calisiyor");
        softAssert.assertEquals(1,5 , "esit degildir");
        System.out.println("Assersion sonrasi calisiyor");

        softAssert.assertAll();
    }


}
