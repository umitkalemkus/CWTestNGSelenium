package UmitPractise;

import clarusway.utilities.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproveSeleniumExample extends Basetest {



    @Test(dataProvider = "testData")

    public void amazonSearch(String key){
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(key+ Keys.ENTER);
        WebElement searchResult = driver.findElement(By.className("a-color-state"));

        // Arama sonucunun aradigimiz kelimeyi icerip icermedigi kontrol edilir
        Assert.assertTrue(searchResult.getText().contains(key));



    }


    @DataProvider(name = "testData")
    public Object[][] dataProvider() {
        Object[][] data = {
                {"java"},
                {"python"},
                {"cypress"}
        };
        return data;
    }





}
