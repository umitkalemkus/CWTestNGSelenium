package UmitPractise;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


    @DataProvider (name = "testData")
    public Object[][] dataProvider2() {
        Object[][] data = {
                {"First Test","birinci test"},
                {"Second Test","ikinci test"},
                {"Third Test","ucuncu test"}
        };
        return data;
    }



}
