package UmitPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample {

    @Test (dataProvider = "dataProvider")
    public void test01(String name , Integer password ) {

        System.out.println(name + "  =  "+ password);


    }


    @DataProvider
    public Object [][] dataProvider(){
        Object [][] data ={
                {"Umit",123},
                {"Kalemkus",234},
                {"QA",23333}
        };
        return data;
    }
}
