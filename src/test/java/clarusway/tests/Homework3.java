package clarusway.tests;

import clarusway.utilities.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Homework3 extends Basetest {
    /*Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.*/

    @Test
    public void test01() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("student");

        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Password123");

        WebElement SubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
         SubmitButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/");
        SoftAssert softAssert=new SoftAssert();
        WebElement TextMessage = driver.findElement(By.className("post-title"));
       String Message = TextMessage.getText();
        System.out.println(Message);
       softAssert.assertEquals(Message,"Logged In Successfully");
       softAssert.assertAll();

       // Assert.assertEquals(Message,"Logged In Successfully");



        WebElement logOut = driver.findElement(By.linkText("Log out"));

        Assert.assertTrue(logOut.isDisplayed());








    }
}
