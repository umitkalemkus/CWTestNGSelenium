package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C04_Enabled {

    @Test(enabled = true)
    public void enabledTest() {
        System.out.println("Test calisiyor ");
    }

    @Test(enabled = true)
    public void disabledTest() {
    }
}
