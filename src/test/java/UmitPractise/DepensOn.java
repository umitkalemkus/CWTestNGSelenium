package UmitPractise;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepensOn {

    @Test
    public void loginTest() {

        System.out.println("Login Testi yapiliyor.");
       // Assert.fail();


    }
    @Test
    public void registrationTest(){
        System.out.println("Kayit testi yapiliyor");
       // Assert.fail();



    }




    @Test (dependsOnMethods = {"loginTest","registrationTest"})
    public void homePageTest() {
        System.out.println(" We enter home page");



    }












}
