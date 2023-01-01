package clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C03_ParametersExample {

    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName){
     //Driver konfigurasyonlari yapiliyor
        if(browserName.equals("chrome")){
            driver = "chrome";
            
        } else if (browserName.equals("firefox")) {
            driver = "firefox";
        } else if (browserName.equals("opera")) {
            driver = "opera";
        }
        System.out.println("Driver objesi olusturuldu -"+ driver);
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("Driver sonlandirildi");

        //driver kapatiliyor


    }

    @Test
    public void test(){

        //testimiz gerceklesiyor
        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " +driver);


    }


}
