import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {

   WebDriver driver;
    @Before
    public void  setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropDown(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);

        //1.index'i secerek ilk secenegi sectik
        select.selectByIndex(1);

        // Value secerek ikinci secenegi seciyoruz
        select.selectByValue("2");

        //3. Visible text i kullanark  1 tekrar secelim
        select.selectByVisibleText("Option 1");
        List<WebElement> list=select.getOptions() ;
        for (WebElement w:list)
           {
            System.out.println(w.getText());
        }

        int size=list.size();
        System.out.println(size);

        if (size==4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //assert

        Assert.assertFalse(size==4);


    }
}
