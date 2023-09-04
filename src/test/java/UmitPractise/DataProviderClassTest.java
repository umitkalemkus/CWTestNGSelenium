package UmitPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassTest {




    @Test(dataProvider = "testData",
            dataProviderClass = DataProviderClass.class
    )
    public void dataproviderTest(String english , String turkish){

        System.out.println("english = " + english);
        System.out.println("turkish = " + turkish);



    }



}
