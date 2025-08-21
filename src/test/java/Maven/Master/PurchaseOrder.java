package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class PurchaseOrder {
    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.satmace.com/auth/login");

        // 1. Login page
        driver.get("https://test.satmace.com/");
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(3000); // wait after login

        // 2. Material Inward section open
        driver.findElement(By.xpath("//span[contains(text(),'Purchase Order')]")).click();
        Thread.sleep(2000);

        // 3. Create New
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a/span[2]")).click();
        Thread.sleep(2000);

//        Trade Partner *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("trade_partner")).sendKeys("Rajaram");
        driver.findElement(By.xpath("//*[@id=\"trade_partner-0\"]/span/div/span")).click();
        
        
      ///	    Planned Start Date *
      		driver.findElement(By.name("purchase_order_date")).click();
              driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();


//        Center *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[4]/div/div/div/div[2]")).click();
        driver.findElement(By.id("center")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"center-1\"]/span/div/span")).click();
       
        
//      Warehouse *
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[5]/div/div/div/div[2]")).click();
      driver.findElement(By.id("warehouse")).sendKeys("Mumbai Warehouse T1");
      driver.findElement(By.xpath("//*[@id=\"warehouse-0\"]/span/div/span")).click();
     
      
//    Purchase Order Terms * *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[6]/div/div/div/div[2]")).click();
    driver.findElement(By.id("terms_and_conditions")).sendKeys("Test");
    driver.findElement(By.xpath("//*[@id=\"terms_and_conditions-0\"]/span/div/span")).click();

//        Disclose Rate Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[7]/div/div/div/label/i")).click();
        
//      Save Button 
      driver.findElement(By.xpath("//*[@id=\"button\"]/span")).click();
      
        
//        Item Search 
        driver.findElement(By.id("item_search")).sendKeys("red plastic");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[1]/div")).click();
        
//       Quantity *
        driver.findElement(By.id("v-field-13")).clear();
        driver.findElement(By.id("v-field-13")).sendKeys("1000");
        
//        Rate
        driver.findElement(By.id("rate-undefined")).sendKeys("20");
        
//        RCM
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/form/div[2]/div[4]/div/div/div/label/i")).click();
        
//        Packaging
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("packaging")).sendKeys("Loose");
        driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
       
        
        ///	    Expected Delivery Date *
  		driver.findElement(By.name("expected_delivery_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();

          
//       Delivery Mode *
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"delivery_mode\"]")).click();
        driver.findElement(By.id("delivery_mode")).sendKeys("Road");
        driver.findElement(By.xpath("//*[@id=\"delivery_mode-multiselect-option-ROAD\"]/span")).click();
       
        
//        Item Description *
        driver.findElement(By.id("description")).sendKeys("Test");
        
//        Add Button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/form/div[4]/button")).click();
        
//       2nd Item Add  
        
//      Item Search 
      driver.findElement(By.id("item_search")).clear();
      driver.findElement(By.id("item_search")).sendKeys("green plastic");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div")).click();
      
//     Quantity *
      driver.findElement(By.id("v-field-29")).clear();
      driver.findElement(By.id("v-field-29")).sendKeys("1000");
      
//      Rate
      driver.findElement(By.id("rate-undefined")).sendKeys("20");
      
//      Is RCM?
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[2]/div[4]/div/div/div/label/i")).click();
      
//      Packaging
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div/div/div/div[2]")).click();
      driver.findElement(By.id("packaging")).sendKeys("Loose");
      driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
      
    ///	    Expected Delivery Date *
		driver.findElement(By.name("expected_delivery_date")).click();
        driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();

        
//      Delivery Mode *
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"delivery_mode\"]")).click();
       driver.findElement(By.id("delivery_mode")).sendKeys("Road");
       driver.findElement(By.xpath("//*[@id=\"delivery_mode-multiselect-option-ROAD\"]/span")).click();
      
       
//     Item Description *
     driver.findElement(By.id("description")).sendKeys("Test");  
     
      
//      Add Button
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/form/div[4]/button")).click();
      
//    Preview
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[3]/a/span")).click();
      
//      Approved Button
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[1]/div[2]/button/span")).click();

      
      //        driver.quit();
        
        }
}
