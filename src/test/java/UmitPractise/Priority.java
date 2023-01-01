package UmitPractise;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 1002)
    public void Test01() {
        System.out.println("a");


    }


    @Test(priority = 5)
    public void test02() {

        System.out.println("c");


    }

    @Test(priority = 1000)
    public void test03() {

        System.out.println("b");
    }
}
