package UmitPractise;

import clarusway.utilities.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample extends Basetest {


     @Test
    public void PositiveLoginTest(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement login = driver.findElement(By.id("submit"));
        login.click();
        WebElement title = driver.findElement(By.className("post-title"));
         System.out.println(title.getText());

         Assert.assertEquals(title.getText(),"Logged In Successfully");
     }

    @Test
    public void NegativeLoginTest(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("incorrectUser");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement login = driver.findElement(By.id("submit"));
        login.click();
        WebElement title = driver.findElement(By.id("error"));


        SoftAssert softAssert = new SoftAssert();
                softAssert.assertEquals(title.getText(),"Congrulations");

        //Assert.assertEquals(title.getText(),"Congrulations");
        System.out.println(title.getText());

        softAssert.assertAll();

    }




}
