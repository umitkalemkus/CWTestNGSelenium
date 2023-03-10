package clarusway.tests;

import clarusway.utilities.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Homework4 extends Basetest {
   /* Test Case2: Negative Username Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username incorrectUser into Username field.
    Type password Password123 into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your username is invalid!*/

    @Test
    public void UserNameTest() {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("incorrectUser");


        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Password123");

        WebElement SubmitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        SubmitButton.click();

        WebElement InvalidMessage = driver.findElement(By.xpath("//div[@id='error']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(InvalidMessage.isDisplayed());
        softAssert.assertAll();

        softAssert.assertTrue(InvalidMessage.getText().contains("Your username is invalid!"));





    }
}

