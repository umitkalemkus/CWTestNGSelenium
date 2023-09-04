package UmitPractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametre {


    @Test
    @Parameters("isim")
    public void test01(String name){


        System.out.println("Hello "+ name);






    }




}
