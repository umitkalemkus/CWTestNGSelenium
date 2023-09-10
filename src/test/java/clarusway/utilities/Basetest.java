package clarusway.utilities;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;

public abstract class Basetest {

    public WebDriver driver;
    public Actions actions;





    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
        driver = new ChromeDriver(co);
       // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions = new Actions(driver);
    }
    @AfterMethod
    public void teardown(){
        //driver.quit();
    }
}
