package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Random;

public class Drivers {

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
        driver.findElement(By.partialLinkText("Drivers")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Names
        Random random = new Random();
        String randomName1 = "Ramu-" + random.nextInt(100000);

        driver.findElement(By.id("name")).sendKeys(randomName1);
        
     
//               Date Of Birth *
      		driver.findElement(By.name("date_of_birth")).sendKeys("2000-08-12");
            driver.findElement(By.xpath("//*[@id=\"2000-08-12\"]/div")).click();
              
//            Phone Number
              driver.findElement(By.name("phone_number")).sendKeys("9999999999");
        
//              License Number *
              driver.findElement(By.name("license_number")).sendKeys("9999999999");
        
              
////        Two Wheeler Light
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[1]/div/div/div/label/i")).click();
//
////     Four Wheeler Light
////      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[3]/div/div/div/label/i")).click();
//
////   Commercial Truck
//    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[5]/div/div/div/label")).click();
//
//    
////  Commercial Forklift
//  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[7]/div/div/div/label/i")).click();
//
//  
////Two Wheeler Any
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[2]/div/div/div/label/i")).click();
//
//
////Four Wheeler Any
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[4]/div/div/div/label/i")).click();
//
//
//// Commercial Trailer
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div/div/div[2]/div/form/div/div[2]/div/div/div[2]/div[1]/div/div/div/label/i")).click();
//

        
//        Save button 
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div/div[4]/button[2]/span")).click();
        
//        Save & Preview 
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div/div[4]/button[1]/span")).click();
    }
    
}
