package UmitPractise;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample_2 extends BaseCrossBrowserTest {


    @Test(dataProvider = "keyData")
    public void googlesearch(String key){
        driver.get("https://www.google.co.uk/");

        WebElement searchButton = driver.findElement(By.xpath("//input[@title='Search']"));
        WebElement GoogleCookie = driver.findElement(By.xpath("//div[starts-with(text(),'Accept all')]"));
        GoogleCookie.click();
        searchButton.sendKeys(key+ Keys.ENTER);



    }


    @DataProvider
    public Object [][] keyData(){
        return new Object[][]{
                {"Swansea"},
                {"Turkey"},
                {"Wales"}
        };



    }




}
