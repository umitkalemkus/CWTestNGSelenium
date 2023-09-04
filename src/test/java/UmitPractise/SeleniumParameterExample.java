package UmitPractise;

import clarusway.utilities.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumParameterExample  {



     WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String Browsername) {
        switch (Browsername){
            case "chrome":
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
                driver = new ChromeDriver(co);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));





    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();

    }

    @Test
    @Parameters("SearchWord")
    public void test(String Word) {
        driver.get("https://www.amazon.com");
        WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
        searchText.sendKeys(Word);





    }
}
