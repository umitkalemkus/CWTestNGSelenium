package clarusway.tests;

import clarusway.utilities.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Homework5 extends Basetest {
   /* Test Case3: Negative Password Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field.
    Type password incorrectPassword into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your password is invalid!*/

    @Test
    public void UserNameTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("student");


        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("incorrectPassword");

        WebElement SubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        SubmitButton.click();

        WebElement InvalidMessage = driver.findElement(By.xpath("//div[@id='error']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(InvalidMessage.isDisplayed());


        softAssert.assertTrue(InvalidMessage.getText().contains("Your password is invalid!"));


    }
}