package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class WarehouseTransfer {
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
		driver.findElement(By.xpath("//span[text()='Warehouse Transfer']")).click();
		
		// Step 3: Click Create New
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();

        // Step 4: Select Start Date
        driver.findElement(By.name("start_date")).click();
        driver.findElement(By.xpath("//*[@id='2025-07-28']/div")).click();

        Thread.sleep(3000); // Playwright pause equivalent

        // Step 5: From Warehouse
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("source_warehouse")).sendKeys("Mumbai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"source_warehouse-1\"]/span/div/span")).click();

        // Step 6: To Warehouse
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div/form/div[5]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("dest_warehouse")).sendKeys("GOA");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dest_warehouse-0\"]/span/div/span")).click();

        // Step 7: Vehicle No
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div/form/div[5]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("vehicle")).sendKeys("MH");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"vehicle-0\"]/span/div/span")).click();

        // Step 8: Driver Name
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div/form/div[5]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("driver")).sendKeys("Raju");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"driver-0\"]/span/div/span")).click();

        // Step 9: Save Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[8]/button")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("item")).sendKeys("red");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();

        // Step 11: Packaging
        driver.findElement(By.id("packaging")).click();
        driver.findElement(By.id("packaging")).sendKeys("Loose");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"packaging-multiselect-option-66734458-769a-424f-9774-e4706b9eebb2\"]/span")).click();
	
        
        // Step 12: Quantity
        Thread.sleep(5000);
        driver.findElement(By.id("v-field-22")).clear();
        driver.findElement(By.id("v-field-22")).sendKeys("10");
        Thread.sleep(5000);
        driver.findElement(By.id("v-field-23")).clear();
        driver.findElement(By.id("v-field-23")).sendKeys("10");
        
        // Step 13: Add Button
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[3]/div/button")).click();
        

        for (int i = 0; i < 100; i++) {
            // Step 10: Item
            driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div/div[1]/div/div/div/div[2]")).click();
            driver.findElement(By.id("item")).sendKeys("red");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();

//            // Step 11: Packaging
//            driver.findElement(By.id("packaging")).click();
//            driver.findElement(By.id("packaging")).sendKeys("Loose");
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("//*[@id=\"packaging-multiselect-option-66734458-769a-424f-9774-e4706b9eebb2\"]/span")).click();
   	
            
            // Step 12: Quantity
            Thread.sleep(5000);
            driver.findElement(By.id("v-field-22")).clear();
            driver.findElement(By.id("v-field-22")).sendKeys("1");
            Thread.sleep(5000);
            driver.findElement(By.id("v-field-23")).clear();
            driver.findElement(By.id("v-field-23")).sendKeys("1");

            // Step 13: Add Button
            driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[1]/form/div/div[3]/div/button")).click();
        }

        Thread.sleep(5000);

//        // Step 14: Save Button
//        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[4]/button[2]")).click();
//        Thread.sleep(5000);

        // Step 15: Save and Preview Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[4]/button[1]/span")).click();
        Thread.sleep(5000);

//        Approved Button 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[1]/div[2]/button")).click();

        Thread.sleep(3000);

        // Close browser
//        driver.quit();
    }
}