package clarusway.tests.UmitPracties;


import org.testng.annotations.Test;

public class Day01_C04_Enabled {

    @Test(enabled = true)
    public void enabledTest(){

        System.out.println("True calisiyor");



    }

     @Test(enabled = false)
    public void disabledTest(){
         System.out.println("False calismiyor");



    }






}
