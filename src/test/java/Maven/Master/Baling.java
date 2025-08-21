package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class Baling {
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
		driver.findElement(By.xpath("//span[text()='Baling']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();

//        Quality Checked Items
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/div/div/label/i")).click();
//        Auto Generate Code
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div/div/label/i")).click();
        
        
        // Warehouse
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[6]/div/div/div/div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"warehouse-1\"]/span/div/span")).click();
       
//        Item *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[7]/div/div/div/div[2]")).click();
        driver.findElement(By.id("item")).sendKeys("red plastic");
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();
       
//        Unit *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[8]/div/div/div/div[2]")).click();
        driver.findElement(By.id("unit")).sendKeys("KGS");
        driver.findElement(By.xpath("//*[@id=\"unit-0\"]/span/div/span")).click();
        
//        Source Packaging
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[9]/div/div/div/div[2]")).click();
        driver.findElement(By.id("source_packaging")).sendKeys("loose");
        driver.findElement(By.xpath("//*[@id=\"source_packaging-0\"]/span/div/span")).click();
        
//        Destination Packaging *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[10]/div/div/div/div[2]")).click();
        driver.findElement(By.id("dest_packaging")).sendKeys("Bale");
        driver.findElement(By.xpath("//*[@id=\"dest_packaging-0\"]/span/div/span")).click();
       
//        Machinery *
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[12]/div/div/div/div[2]")).click();
        driver.findElement(By.id("machine")).sendKeys("Machine T1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"machine-20\"]/span/div/span")).click();
        
//        Number of Males & Females
        driver.findElement(By.id("male_count")).sendKeys("10");
        driver.findElement(By.id("female_count")).sendKeys("10");
        
//        Save Button 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[4]/button[2]")).click();
         
//       1st Bale 
         	    // Enter Gross Weight
    	    driver.findElement(By.id("v-field-17")).sendKeys("10");

    	    // Enter Net Weight
    	    driver.findElement(By.id("v-field-18")).sendKeys("10");

    	    // Click Save Output
    	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/form/div/div[5]/button")).click();

    	    // Wait for form to reload/prepare next entry
    	    Thread.sleep(2000);
    	    
//          1st Bale 
     	    // Enter Gross Weight
	    driver.findElement(By.id("v-field-20")).sendKeys("10");

	    // Enter Net Weight
	    driver.findElement(By.id("v-field-21")).sendKeys("10");

	    // Click Save Output
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/form/div/div[5]/button")).click();

	    // Wait for form to reload/prepare next entry
	    Thread.sleep(2000);
	
	    
//      1st Bale 
 	    // Enter Gross Weight
    driver.findElement(By.id("v-field-23")).sendKeys("10");

    // Enter Net Weight
    driver.findElement(By.id("v-field-24")).sendKeys("10");

    // Click Save Output
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div[1]/div/div/form/div/div[5]/button")).click();

    // Wait for form to reload/prepare next entry
    Thread.sleep(2000);   
       
        
//        Save & Preview  Button 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div[2]/button/span")).click();

        // Approve
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/button")).click();

      
        driver.quit();
    }
}
