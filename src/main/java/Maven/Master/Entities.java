package Maven.Master;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Entities {

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
        driver.findElement(By.partialLinkText("Entities")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Test T3"); //always changes (for new Entities )
        driver.findElement(By.id("short_name")).sendKeys("T..3"); //always changes
        driver.findElement(By.id("phone_number")).sendKeys("9699030003");
        driver.findElement(By.id("email")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("secondary_phone_number")).sendKeys("9999999999");
        driver.findElement(By.id("website")).sendKeys("https://satmace.com");
              
//        Dropdwon list ( Entity Type * )
        driver.findElement(By.id("entity_type")).click();
        driver.findElement(By.id("entity_type")).sendKeys("Individual");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect-option"))) {
            if (option.getText().contains("Individual")) {
                option.click();
                break;
            }
        }
        
//      Dropdwon list (  Currency * )
      driver.findElement(By.id("currency")).click();
      driver.findElement(By.id("currency")).sendKeys("Indian rupee");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect-option"))) {
          if (option.getText().contains("Indian rupee")) {
              option.click();
              break;
          }
      }
      
//    Dropdwon list (  Reporting Currency * )
    driver.findElement(By.id("reporting_currency")).click();
    driver.findElement(By.id("reporting_currency")).sendKeys("Indian rupee");
    Thread.sleep(2000);
    // Find list of options and click the matching one
    for (WebElement option : driver.findElements(By.cssSelector("li.multiselect-option"))) {
        if (option.getText().contains("Indian rupee")) {
            option.click();
            break;
        }
    }
     
    
    driver.findElement(By.id("tax_number")).sendKeys("ADCPI2142L");
    
    driver.findElement(By.name("tax_number_effective_date")).click();
    driver.findElement(By.name("tax_number_effective_date")).sendKeys("2025-07-18");  // YYYY-MM-DD for <input type="date">

    
    driver.findElement(By.cssSelector("button[type='submit']")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[2]/button[1]")).click();


//    / Take Screenshot after click
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination = new File("screenshot_after_save.png");
    FileUtils.copyFile(source, destination);
        

    }
//
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
