package clarusway.tests;

import clarusway.utilities.Basetest;
import org.testng.annotations.*;

public class Homework1 extends Basetest {

    @Test
    public void test01(){
        System.out.println("Test01 is running");

    }
    @Test
    public void test02(){
        System.out.println("Test02 is running");

    }
    @BeforeSuite
    public void Beforesuite(){
        System.out.println("Beforsuite is running");
    }
    @AfterSuite
    public void Aftersuite(){
        System.out.println("Aftersuite is running");

    }
    @BeforeTest
    public void Beforetest(){
        System.out.println("Befortest is running");

    }
    @AfterTest
    public void Aftertest(){
        System.out.println("Aftertest is running");

    }
    @BeforeClass
    public void Beforeclass(){
        System.out.println("Beforclass is running");

    }
    @AfterClass
    public void Afterclass(){
        System.out.println("Afterclass is running");

    }
    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Beformethod is running");

    }
    @AfterMethod
    public void Aftermethod(){
        System.out.println("Aftermethod is running");

    }
}
