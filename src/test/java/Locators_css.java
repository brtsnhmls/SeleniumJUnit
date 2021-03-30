import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators_css {

    WebDriver driver;
    @Before
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void LoginTest(){
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement userName= driver.findElement(By.cssSelector("#session_email"));
        userName.sendKeys("testtechproed@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("#session_password"));
        password.sendKeys("Test1234!");

        WebElement signIn= driver.findElement(By.cssSelector("Input[type='submit']"));
        signIn.click();
    }

    @Test
    public void CheckBoxTest(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1= driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
        checkbox1.click();

       WebElement checkbox2= driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
        checkbox2.click();

      System.out.println("Master branch commit");



    }
}
