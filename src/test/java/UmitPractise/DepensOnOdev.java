package UmitPractise;

import clarusway.utilities.Basetest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DepensOnOdev extends Basetest {

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com/");
        System.out.println("Facebook Testi yapiliyor.");
       // Assert.fail();


    }
    @Test(dependsOnMethods = {"facebook"})
    public void google(){
        driver.get("https://www.google.co.uk/");
        System.out.println("Google testi yapiliyor");
       // Assert.fail();



    }




    @Test (dependsOnMethods = {"google"})
    public void amazon() {
        driver.get("https://www.amazon.com/");
        System.out.println("Amazon testi yapiliyor");



    }












}
