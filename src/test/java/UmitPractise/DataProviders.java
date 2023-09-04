package UmitPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    @Test(dataProvider = "dataProvider2")
    public void test01(String username , String password , String email) {

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email = " + email);



    }

    @DataProvider
    public Object[][] dataProvider() {
      Object[][] data = {
              {"Umit","123"},
              {"Kalemkus","345"},
              {"KeyPoint","789"}
      };
        return data;
    }


    @DataProvider
    public Object[][] dataProvider2() {
        Object[][] data = {
                {"Umit","111","umitk@yopmail.com"},
                {"Kalemkus","222","umitk75@yopmail.com"},
                {"KeyPoint","333","umitk85@yopmail.com"}
        };
        return data;
    }




    }










