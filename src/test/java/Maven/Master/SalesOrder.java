package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SalesOrder {
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
        driver.findElement(By.xpath("//span[contains(text(),'Sales Order')]")).click();
        Thread.sleep(2000);

        // 3. Create New
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a/span[2]")).click();
        Thread.sleep(2000);
        
      ///	    Sales Order Date *
  		driver.findElement(By.name("sales_order_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-20\"]/div")).click();
          

//       Trade_Partner 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[4]/div/div/div/div[2]")).click();
        driver.findElement(By.id("trade_partner")).sendKeys("Rajaram");
        driver.findElement(By.xpath("//*[@id=\"trade_partner-0\"]/span/div/span")).click();
        
//        Trade Partner Order Number *
        driver.findElement(By.id("trade_partner_order_number")).sendKeys("11");
        
        
      ///	    Trade Partner Order Date *
  		driver.findElement(By.name("trade_partner_order_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-20\"]/div")).click();
          

        
//      Billing Address *
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[7]/div/div/div/div[2]")).click();
      driver.findElement(By.id("billing_address")).sendKeys("x");
      driver.findElement(By.xpath("//*[@id=\"billing_address-0\"]/span/div/span")).click();
      
//    Shipping Address *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[8]/div/div/div/div[2]")).click();
    driver.findElement(By.id("shipping_address")).sendKeys("x");
    driver.findElement(By.xpath("//*[@id=\"shipping_address-0\"]/span/div/span")).click();
    
      
//    Warehouse *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[10]/div/div/div/div[2]")).click();
    driver.findElement(By.id("warehouse")).sendKeys("Mumbai Warehouse T1");
    driver.findElement(By.xpath("//*[@id=\"warehouse-0\"]/span/div/span")).click();
    
//    Bank Account *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[11]/div/div/div/div[2]")).click();
    driver.findElement(By.id("entity_bank_account")).sendKeys("999");
    driver.findElement(By.xpath("//*[@id=\"entity_bank_account-0\"]/span/div/span")).click();
   
    
    
//    Sales Order Terms *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[12]/div/div/div/div[2]")).click();
    driver.findElement(By.id("sales_term_and_conditions")).sendKeys("Test");
    driver.findElement(By.xpath("//*[@id=\"sales_term_and_conditions-0\"]/span/div/span")).click();
   
      
      
//    Payment Term *
    driver.findElement(By.xpath("//*[@id=\"payment_term\"]")).click();
    driver.findElement(By.id("payment_term")).sendKeys("Advance");
    driver.findElement(By.xpath("//*[@id=\"payment_term-multiselect-option-33\"]/span")).click();
    
     
//            Save Button 
              driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[2]/button[2]/span")).click();
       
//    item search 
    driver.findElement(By.xpath("//*[@id=\"item_search\"]")).click();
    driver.findElement(By.id("item_search")).sendKeys("red");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div")).click();
    
    driver.findElement(By.id("v-field-22")).clear();
    driver.findElement(By.id("v-field-22")).sendKeys("1000");
    
    driver.findElement(By.id("rate")).sendKeys("100");
    
    
//  Packaging
  Thread.sleep(5000);
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/form/div[1]/div[2]/div[1]/div/div/div/div[2]")).click();
  driver.findElement(By.id("packaging")).sendKeys("Loose");
  driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
  
///	    Expected Delivery Date *
	driver.findElement(By.name("expected_delivery_date")).click();
    driver.findElement(By.xpath("//*[@id=\"2025-08-24\"]/div")).click();

    
////  Delivery Mode *
//   Thread.sleep(5000);
//   driver.findElement(By.xpath("//*[@id=\"dispatch_mode\"]")).click();
//   driver.findElement(By.id("delivery_mode")).sendKeys("Road");
//   driver.findElement(By.xpath("//*[@id=\"delivery_mode-multiselect-option-ROAD\"]/span")).click();
  
   
// Item Description *
    Thread.sleep(5000);
 driver.findElement(By.id("description")).sendKeys("Test");  
 
  
//  Add Button
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/form/div[2]/button/span[2]")).click();
  
//Preview
  driver.findElement(By.xpath("//*[@id=\"button-save-and-preview\"]/span")).click();
  
//  Approved Button
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/button/span")).click();

  
  //        driver.quit();
    
        
        }
}
