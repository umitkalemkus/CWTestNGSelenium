package clarusway.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public  static String getScreenshot(WebDriver driver , String name) throws IOException {
        // Screen dosya ismi suanki tarihi string olarak giriyoruz
        String date = formatCurrentDate("yyyyMMddhhmmss");

       // Screenshot alip file objesine atiyoruz
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


       //Kayde dosyanin yolunu belirliyoruz.

        String target =System.getProperty("user.dir")+"\\test-output\\Screenshots\\"+name+ date+ ".png";

        File targetFile = new File(target);

        FileUtils.copyFile(source,targetFile);
        return target;











    }


    public static String formatCurrentDate(String pattern){

      return new SimpleDateFormat(pattern).format(new Date());






    }
}
