package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Inward {
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
        driver.findElement(By.xpath("//span[contains(text(),'Material Inward')]")).click();
        Thread.sleep(2000);

        // 3. Create New
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a/span[2]")).click();
        Thread.sleep(2000);

//        Trade Partner *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[3]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("trade_partner")).sendKeys("Rajaram");
        driver.findElement(By.xpath("//*[@id=\"trade_partner-0\"]/span/div/span")).click();
        
//        Transaction Currency *
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[3]/div[3]/div/div/div/div[2]")).click();
//        driver.findElement(By.id("transaction_currency")).sendKeys("Indian rupee");
//        driver.findElement(By.xpath("//*[@id=\"transaction_currency-0\"]/span/div/span")).click();
       
//        Warehouse *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[3]/div[7]/div/div/div/div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"warehouse-1\"]/span/div/span")).click();
       

//        Save Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[4]/button")).click();
        
//        Item Search 
        driver.findElement(By.id("item_search")).sendKeys("red plastic");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
        
//       Quantity *
        driver.findElement(By.id("v-field-13")).clear();
        driver.findElement(By.id("v-field-13")).sendKeys("1000");
        
//        Rate
        driver.findElement(By.id("rate-undefined")).sendKeys("20");
        
//        Packaging
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/form/div[3]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("packaging")).sendKeys("Loose");
        driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
       
        
//        Add Button
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/form/div[4]/button")).click();
        
//       2nd Item Add  
        
//      Item Search 
      driver.findElement(By.id("item_search")).clear();
      driver.findElement(By.id("item_search")).sendKeys("green plastic");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")).click();
      
//     Quantity *
      driver.findElement(By.id("v-field-27")).clear();
      driver.findElement(By.id("v-field-27")).sendKeys("1000");
      
//      Rate
      driver.findElement(By.id("rate-undefined")).sendKeys("20");
      
//      Packaging
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/form/div[3]/div[2]/div/div/div/div[2]")).click();
      driver.findElement(By.id("packaging")).sendKeys("Loose");
      driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
     
      
//      Add Button
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/form/div[4]/button")).click();
      
//      Save & Preview
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button/span[2]")).click();
      
//      Approved Button 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[1]/div[2]/button")).click();

      
      //        driver.quit();
        
        }
}
