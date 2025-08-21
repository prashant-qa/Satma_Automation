package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SalesBill {
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
        driver.findElement(By.xpath("//span[contains(text(),'Sales Bill')]")).click();
        Thread.sleep(2000);

        // 3. Create New
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a/span[2]")).click();
        Thread.sleep(2000);

//        Customer Name *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("trade_partner")).sendKeys("Rajaram");
        driver.findElement(By.xpath("//*[@id=\"trade_partner-0\"]/span/div/span")).click();
        
//      Billing Address *
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div/div[2]")).click();
      driver.findElement(By.id("billing_address")).sendKeys("x");
      driver.findElement(By.xpath("//*[@id=\"billing_address-0\"]/span/div/span")).click();
      
      
//    Warehouse *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[3]/div/div/div/div[2]")).click();
    driver.findElement(By.id("warehouse")).sendKeys("Mumbai Warehouse T1");
    driver.findElement(By.xpath("//*[@id=\"warehouse-0\"]/span/div/span")).click();
    
      
      
//    Payment Term *
    driver.findElement(By.xpath("//*[@id=\"payment_term\"]")).click();
    driver.findElement(By.id("payment_term")).sendKeys("Advance");
    driver.findElement(By.xpath("//*[@id=\"payment_term-multiselect-option-33\"]/span")).click();
    
      
        
      ///	    Due Date *
      		driver.findElement(By.name("due_date")).click();
              driver.findElement(By.xpath("//*[@id=\"2025-08-20\"]/div")).click();
              
//            Save Button 
              driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[2]/button[2]/span")).click();
              


////        Center *
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[4]/div/div/div/div[2]")).click();
//        driver.findElement(By.id("center")).sendKeys("Mumbai");
//        driver.findElement(By.xpath("//*[@id=\"center-1\"]/span/div/span")).click();
//       
        
//      Warehouse *
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[1]/div[2]/div[7]/div/div/div/div[2]")).click();
      driver.findElement(By.id("warehouse")).sendKeys("Mumbai Warehouse T1");
      driver.findElement(By.xpath("//*[@id=\"warehouse-0\"]/span/div/span")).click();
      
//    Save Button 
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/form/div[2]/button[2]/span")).click();
    
//    Dispatch Search Filed 
    driver.findElement(By.name("dispatch_search")).click();
    new Actions(driver).sendKeys(Keys.SPACE).perform();
    
//    Selecte GRN 
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div/h6")).click();
    
//      Item Tick Button 
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/form/div[1]/table/tbody/tr[1]/td[1]/div/div/label/span")).click();
//  
    
    driver.findElement(By.id("v-field-24")).clear();
    driver.findElement(By.id("v-field-24")).sendKeys("10");
    
//    Item Tick Button 
//    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/form/div[1]/table/tbody/tr[1]/td[1]/div/div/label/span")).click();
    
    
//    Save  button 
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/form/div[2]/button")).click();
      
//    Bill Summary
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[1]/div/ul/li[2]/a/span")).click();
    
//    Bank Account *
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div/div/div[1]/div/div/div/div[2]")).click();
    driver.findElement(By.id("bank_account")).sendKeys("999");
    driver.findElement(By.xpath("//*[@id=\"bank_account-0\"]/span/div/span")).click();

    
//  Terms and Conditions *
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div/div/div[2]/div/div/div/div[2]")).click();
  driver.findElement(By.id("term_and_conditions")).sendKeys("Test");
  driver.findElement(By.xpath("//*[@id=\"term_and_conditions-0\"]/span/div/span")).click();

    
//        Save & Preview  Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/form/div[2]/button[1]/span")).click();
        
        
//      Approved Button
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/button")).click();

        
      //        driver.quit();
        
        }
}
