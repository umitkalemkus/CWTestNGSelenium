package UmitPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class SoftAssertClass {

    WebDriver driver;



    @Test
    public void testAssert() throws InterruptedException {


        //1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        //4. Click on 'Products' button
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        //6. The products list is visible
        //7. Click on 'View Product' of first product
        //8. User is landed to product detail page
        //9. Verify that detail detail is visible: product name, category,



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        SoftAssert softAssert = new SoftAssert();

        //3. Verify that home page is visible successfully


        softAssert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

        //4. Click on 'Products' button

        WebElement products = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        products.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully

        WebElement allProductYazielementi = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        softAssert.assertTrue(allProductYazielementi.isDisplayed());

        //6. The products list is visible
        List<WebElement> productList = driver.findElements(By.xpath("//*[text()='View Product']"));
        softAssert.assertTrue(productList.size()>0);


        //7. Click on 'View Product' of first product

        WebElement firstProduct = driver.findElement(By.className("fa fa-plus-square"));

        firstProduct.click();


        //8. User is landed to product detail page

        WebElement productName = driver.findElement(By.partialLinkText("View Product"));
        softAssert.assertTrue(productName.isDisplayed());

        softAssert.assertAll();


        //9. Verify that detail detail is visible: product name, category,

        WebElement categoryElement = driver.findElement(By.xpath("//h2[starts-with(text() ,'Category')]"));
        Assert.assertTrue(categoryElement.isDisplayed());










    }


}
