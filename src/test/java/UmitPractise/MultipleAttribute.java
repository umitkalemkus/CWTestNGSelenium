package UmitPractise;

import org.testng.annotations.Test;

public class MultipleAttribute {

    @Test(
            priority = 5 ,
            groups = {"regression"},
            enabled = false
    )
    public void test1() {




    }
}
