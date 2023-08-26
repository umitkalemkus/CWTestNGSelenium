package UmitPractise;

import org.testng.annotations.Test;

public class Enabled {

    @Test(enabled = true)
    public void testName() {
        System.out.println("Test1 geciyor");


    }

    @Test(enabled = false)
    public void testName2() {
        System.out.println("Test1 kaliyor");
    }
}
