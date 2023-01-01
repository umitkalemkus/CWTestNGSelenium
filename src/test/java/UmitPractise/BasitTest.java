package UmitPractise;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class BasitTest {
    @BeforeClass

    public  void BeforeClass(){


        System.out.println("Sistem baslatiliyor");

    }

    @Test
    public void Test01(){
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);


        int c =a+b;
        System.out.println(c);

        Assert.assertTrue(a<5);






    }


}
