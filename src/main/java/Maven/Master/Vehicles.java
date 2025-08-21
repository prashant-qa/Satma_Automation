package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Random;

public class Vehicles {

    public static void main(String[] args) throws InterruptedException {
        
        // Chrome Driver Setup
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // Step 1: Login
        driver.get("https://test.satmace.com/");
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

        // Step 2: Controls & Master
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Vehicles")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Names
        Random random = new Random();
        String randomName1 = "MH46BT-" + random.nextInt(100);

        driver.findElement(By.id("vehicle_number")).sendKeys(randomName1);
        
//      Make *
        driver.findElement(By.name("make")).sendKeys("TATA");
  
//        Models
        driver.findElement(By.name("model")).sendKeys("TATA");
  
  
//      manufacturer
      driver.findElement(By.name("manufacturer")).sendKeys("TATA");

        
     
//               Date Of Birth *
      		driver.findElement(By.name("date_of_issue")).sendKeys("2000-08-12");
            driver.findElement(By.xpath("//*[@id=\"2000-08-12\"]/div")).click();
              
//            gross_weight
              driver.findElement(By.name("gross_weight")).sendKeys("9000");
        
//             Allowed Capacity *
              driver.findElement(By.name("allowed_total_weight")).sendKeys("9000");
        
              
//        Save & Preview 
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div/div[7]/button[1]/span")).click();
    }
    
}
