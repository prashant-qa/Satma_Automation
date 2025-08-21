package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Random;

public class Warehouses {

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
        driver.findElement(By.partialLinkText("Warehouses")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Names
        Random random = new Random();
        String randomName1 = "Warehouses-" + random.nextInt(100000);
        String randomName2 = "WR-" + random.nextInt(100000);

        driver.findElement(By.id("name")).sendKeys(randomName1);
        driver.findElement(By.id("short_name")).sendKeys(randomName2);
        
        
//        Center *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div/div[2]/div[4]/div/div/div/div[2]")).click();
        driver.findElement(By.id("center")).sendKeys("Center-27297");
        driver.findElement(By.xpath("//*[@id=\"center-0\"]/span/div/span")).click();
       
//        Save button 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div/div[3]/button/span")).click();
        
//        Save & Preview 
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div/div[3]/button[1]/span")).click();
    }
    
}
