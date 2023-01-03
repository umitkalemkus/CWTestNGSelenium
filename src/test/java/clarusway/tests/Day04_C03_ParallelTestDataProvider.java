package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_C03_ParallelTestDataProvider {

    @Test(dataProvider = "getData")
    public void test(String name , String surname) {
    }

    @DataProvider(parallel = true)
    public Object [][] getData(){
        return new Object[][]{
                {"Yusuf", "Celik"},
                {"Can","Efe"},
                {"Merve" ,"Aslan"}


        };

    }



}
