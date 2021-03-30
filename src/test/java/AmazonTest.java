import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    WebDriver driver;
    @Before
    public void seTup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void LoginPageTest(){
        driver.get("http://www.amazon.com/");

        WebElement dropBox= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropBox);
        select.selectByIndex(2);

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mercedes",Keys.ENTER);

        WebElement bestSeller=driver.findElement(By.cssSelector(".a-link-normal.a-text-normal"));
        bestSeller.click();

        WebElement price=driver.findElement(By.id("price_inside_buybox"));
        System.out.println(price.getText());
        
         System.out.println("master branch test");
         System.out.println("master branch test");

        System.out.println("yunus branch test");
        System.out.println("yunus branch test");
        


    }
}
