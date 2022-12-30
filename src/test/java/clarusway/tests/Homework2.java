package clarusway.tests;

import clarusway.utilities.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework2 extends Basetest  {
   /* Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.*/

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


   @Test
   public void Facebook(){

      driver.get("https://www.facebook.com/");

       System.out.println("Facebook");

   }

    @Test(dependsOnMethods ={"Facebook"} )
    public void Google(){
        driver.get("https://www.google.com/");

        System.out.println("Google");


    }
    @Test(dependsOnMethods ={"Google"} )
    public void Amazon(){

        driver.get("https://www.amazon.com/");


        System.out.println("Amazon");


    }





}
