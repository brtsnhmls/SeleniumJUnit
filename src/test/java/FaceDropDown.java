import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FaceDropDown {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void birtday(){
        driver.get("https://www.facebook.com");
        System.out.println("1 Commit Test");
        System.out.println("2 Commit Test");
        System.out.println("3 Commit Test");


        System.out.println("1 Commit yunus");
        System.out.println("2 Commit yunus");
        System.out.println("3 Commit yunus");
    }


}
