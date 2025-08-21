package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class TradePartners {
    public static void main(String[] args) throws InterruptedException {


 	   // Launch Chrome
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.manage().window().maximize();

     // Step 1: Login
     driver.get("https://test.satmace.com/");
     driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
     driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
     driver.findElement(By.cssSelector("button[type='submit']")).click();
     Thread.sleep(5000);


     // Step 3: Controls & Master -> TradePartners
     Thread.sleep(8000);
     driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
     Thread.sleep(3000);
     driver.findElement(By.partialLinkText("Trade Partners")).click();
     Thread.sleep(3000);
     driver.findElement(By.partialLinkText("Create New")).click();
     Thread.sleep(3000);
        // Step 4: Fill form
        Random rand = new Random();
        String partnerName = "Prashant-" + rand.nextInt(100000);

        driver.findElement(By.id("name")).sendKeys(partnerName);
        driver.findElement(By.id("short_name")).sendKeys("TP" + rand.nextInt(1000));
//        driver.findElement(By.id("gst_number")).sendKeys("27AAACB2894G1ZP");

        // Email & Phone
        driver.findElement(By.id("email")).sendKeys("tradepartner" + rand.nextInt(1000) + "@gmail.com");
        driver.findElement(By.id("phone_number")).sendKeys("98765432" + rand.nextInt(99));

        // Entity Type *
        driver.findElement(By.xpath("//*[@id=\"entity_type\"]")).click();
        driver.findElement(By.id("entity_type")).sendKeys("Individual");
        driver.findElement(By.xpath("//*[@id=\"entity_type-multiselect-option-INDIVIDUAL\"]/span")).click();
       
        // Gender *
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
        driver.findElement(By.id("gender")).sendKeys("male");
        driver.findElement(By.xpath("//*[@id=\"gender-multiselect-option-3\"]/span")).click();
        
//        Vendor
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div[11]/div/div/div/label/i")).click();
        
//        Customer
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div[12]/div/div/div/label/i")).click();
       
        
//        Currency Information
//        Country *
        
        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
        driver.findElement(By.id("country")).sendKeys("india");
        driver.findElement(By.xpath("//*[@id=\"country-multiselect-option-IN\"]/span")).click();
       
        
        //  Save & Preview 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div[2]/div/form/div[7]/button[1]/span")).click();

      
        Thread.sleep(5000);
        driver.quit();
    }
}
