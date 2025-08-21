package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class Dispatch {
    public static void main(String[] args) throws InterruptedException {

        // Chrome Driver Setup
    	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.satmace.com/auth/login");
		
		driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
		driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

        // Dispatch
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dispatch Order']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();

        // trade_partner
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[1]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("trade_partner")).sendKeys("Prashant");
        driver.findElement(By.xpath("//*[@id=\"trade_partner-0\"]/span/div/span")).click();

        // Warehouse
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[1]/div[6]/div/div/div/div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"warehouse-1\"]/span/div/span")).click();
        
//        Save Button 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[3]/button")).click();

       
        //  1st Item ( Item Name *)
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("item_search")).sendKeys("red plastic");
//        driver.findElement(By.xpath("//*[@id=\"grn_line_item-0\"]/span/div/span")).click();

//        Packaging
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("packaging")).sendKeys("Bale");
        driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
        
//        Item Selecet 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div")).click();
        
//        Quantity *
        Thread.sleep(3000);
        driver.findElement(By.id("v-field-25")).clear();
        driver.findElement(By.id("v-field-25")).sendKeys("10");
        
//      Rate *
      driver.findElement(By.id("rate")).clear();
      driver.findElement(By.id("rate")).sendKeys("10");
      
//      GST Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/form/div[2]/div[5]/div/div/div/label/i")).click();
      
//        Add Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/form/button")).click();
      
//     2nd Item Search 
      driver.findElement(By.id("item_search")).clear();
      driver.findElement(By.id("item_search")).sendKeys("Green PLastic");
      
//     2nd item Select 
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div")).click();
      
      
//    Quantity *
    driver.findElement(By.id("v-field-35")).clear();
    driver.findElement(By.id("v-field-35")).sendKeys("10");
    
//  Rate *
  driver.findElement(By.id("rate")).clear();
  driver.findElement(By.id("rate")).sendKeys("10");
  
//  GST Button 
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/form/div[2]/div[5]/div/div/div/label/i")).click();
  
//    Add Button 
  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/form/button")).click();
  
        // Save & Preview
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/button")).click();

        // Approve
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[1]/div[2]/button")).click();

      
        driver.quit();
    }
}
