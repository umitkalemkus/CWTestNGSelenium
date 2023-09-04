package UmitPractise;

import clarusway.utilities.Basetest;
import org.testng.annotations.*;

public class ParametersExample  {
       String driver;
    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName) {

       if(browserName.equals("chrome")){
           driver="chrome";

       }
       else if (browserName.equals("firefox")){
           driver="firefox";
           
       } else if (browserName.equals("edge")) {
           driver="edge";
       }
        System.out.println("Driver = "+driver);

    }



    @AfterMethod
    public void tearDown() {
        driver = "";
        System.out.println("driver was ended");

    }

    @Test
    public void test() {
        System.out.println("Test execution is started");
        System.out.println("Used driver "+driver);



    }
}
