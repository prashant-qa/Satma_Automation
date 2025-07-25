package Maven.Master;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // ✅ Auto-handles driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://test.satmace.com/");
        
        Thread.sleep(3000);
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[5]/button")).click();
    }

    @Test
    public void testEntities() throws InterruptedException, IOException {

        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Trade Partners")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.partialLinkText("Create New")).click();
        
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")).click();
        
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[1]/div[5]/a")).click();
        
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div[1]/div/ul/li[2]/a")).click();
        

    Thread.sleep(6000);
//    Billing 
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div[2]/div/div/div/label")).click();
//    Shipping
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div[3]/div/div/div/label")).click();

// GST Toggle Button    
  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div[8]/div/div/div/label")).click();

    Thread.sleep(6000);
    
    driver.findElement(By.xpath("//input[@placeholder='Enter a location']")).sendKeys("Bandra");
    
    Thread.sleep(2000);

    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.ARROW_DOWN)
           .sendKeys(Keys.ENTER)
           .perform();
    
    Thread.sleep(8000);
    
    driver.findElement(By.id("postal_code")).sendKeys("400050");
    
    }
//
//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//    }
}
