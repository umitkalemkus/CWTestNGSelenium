package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day06_C01_ExcelUtil extends BaseCrossBrowserTest {


    @Test
    public void test(){
        String path = "C:\\Users\\umitkalemkus\\IdeaProjects\\CWTestNGSelenium\\src\\test\\java\\clarusway\\resourse\\testdata.xlsx";
       // String path =" C:\\Users\\umitkalemkus\\IdeaProjects\\CWTestNGSelenium\\src\\test\\java\\clarusway\\resourse\\testdata.xlsx";

        ExcelUtils eu = new ExcelUtils(path, 2);

        driver.get("http://crossbrowsertesting.github.io/login-form.html");

        String email = eu.getCellData(1,0); //A2 SATIRLAR VE SUTUNLAR 0 DAN BASLAR
        String password = eu.getCellData(1,1);//B2

        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



        WebElement welcome = driver.findElement(By.xpath("//h2[contains(.,'Welcome')]"));
        wait.until(ExpectedConditions.visibilityOf(welcome));

        Assert.assertTrue(welcome.getText().contains(email));


    }
}
