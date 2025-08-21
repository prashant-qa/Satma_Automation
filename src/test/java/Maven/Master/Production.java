package SatmaCE.Master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Production {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.satmace.com/auth/login");
		
		driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
		driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Production']")).click();
		
//		Create New Button Create New
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();
		
//		Production   //
		
//		Output Item *
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/form/div[3]/div[1]/div/div/div/div[2]")).click();
		driver.findElement(By.id("output_item")).sendKeys("Final");
		driver.findElement(By.xpath("//*[@id=\"output_item-0\"]/span/div")).click();
		

//		Work Order No *
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]")).click();
		driver.findElement(By.id("work_order")).sendKeys("37");
		driver.findElement(By.xpath("//*[@id=\"work_order-0\"]/span/div")).click();
		
///	    Planned Start Date *
		driver.findElement(By.name("planned_start_date")).click();
        driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();
        

        // Planned End Date *
          driver.findElement(By.name("planned_end_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();
    
          
//          Produced By
          driver.findElement(By.id("supervisor")).sendKeys("Prashant");
          
//          Save Button 
          driver.findElement(By.id("button")).click();
          
      	Thread.sleep(3000);
          
//          create-new-lot
          driver.findElement(By.id("create-new-lot")).click();
          
//          Adding New Batch
//          General Details
          driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/form/div[3]/div[1]/div/div/div/div[2]")).click();
          driver.findElement(By.id("process")).sendKeys("T1");
          driver.findElement(By.xpath("//*[@id=\"process-0\"]/span/div")).click();
       
          
       //Start Date & Time *
          driver.findElement(By.name("start_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();
          driver.findElement(By.xpath("//*[@id=\"start_date\"]/div[2]/div/div/div[2]/div[2]/button[2]")).click();
    
        //End Date & Time *
          driver.findElement(By.name("end_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();
          driver.findElement(By.xpath("//*[@id=\"end_date\"]/div[2]/div/div/div[2]/div[2]/button[2]")).click();
          
//          Add Machine 
          driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/form/div[3]/div[4]/div/div/div/div[2]")).click();
          driver.findElement(By.id("machine")).sendKeys("Collection");
          driver.findElement(By.xpath("//*[@id=\"machine-0\"]/span/div")).click();
          
          
//          No Of Males
          driver.findElement(By.id("number_of_males")).sendKeys("10");
       
//          No Of Female
          driver.findElement(By.id("number_of_females")).sendKeys("5");
        
//          supervisor
          driver.findElement(By.id("supervisor")).sendKeys("Prashant");
          
//          Shift
          driver.findElement(By.id("shift")).click();
          driver.findElement(By.xpath("//*[@id=\"shift-multiselect-option-NIGHT\"]")).click();
          
//          Save Button 
          driver.findElement(By.id("batch-save-btn")).click();
          
//          Batch Selecte
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div")).click();
         
          ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
         
//          create-new-lot
          driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[3]")).click();
          
//          Adding New Lot ( information )
          driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/form/div[2]/div[1]/div/div/div/div[2]")).click();
          driver.findElement(By.id("manufactured_by")).sendKeys("Prashant");
          driver.findElement(By.xpath("//*[@id=\"manufactured_by-0\"]/span/div")).click();
          
          
//          Manufactured Date & Time *
          driver.findElement(By.name("manufactured_date")).click();
          driver.findElement(By.xpath("//*[@id=\"2025-08-12\"]/div")).click();
          driver.findElement(By.xpath("//*[@id=\"manufactured_date\"]/div[2]/div/div/div[3]/div[2]/button[2]")).click();
    
//          Toggle Button
          driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/form/div[2]/div[4]/div/div/div")).click();
          
          
//          lot-save-btn
          driver.findElement(By.id("lot-save-btn")).click();	
          
      	Thread.sleep(8000);
          
      	((JavascriptExecutor) driver).executeScript("window.scrollBy(5, 1000);");
      	
//          Batch In Item ( 1st )
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
          driver.findElement(By.id("item")).sendKeys("Red");
          driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div")).click();
          
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
          driver.findElement(By.id("packaging")).sendKeys("Loose");
          driver.findElement(By.xpath("//*[@id=\"packaging-2\"]/span/div")).click();
          
          Thread.sleep(5000);
//          Consumed Quantity & UOM *
          driver.findElement(By.name("v-field-38")).clear();
          driver.findElement(By.name("v-field-38")).sendKeys("500");
          
//          Add Qty Button 
          driver.findElement(By.xpath("//*[@id=\"save-input\"]")).click();
//          
//          Batch In Item ( 2st )
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
          driver.findElement(By.id("item")).sendKeys("Green");
          driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div")).click();
          
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
          driver.findElement(By.id("packaging")).sendKeys("Loose");
          driver.findElement(By.xpath("//*[@id=\"packaging-2\"]/span/div")).click();
          
          Thread.sleep(5000);
//        Consumed Quantity & UOM *
        driver.findElement(By.name("v-field-38")).clear();
        driver.findElement(By.name("v-field-38")).sendKeys("500");
        
          
//          Add Qty Button 
          driver.findElement(By.xpath("//*[@id=\"save-input\"]")).click();
          
          Thread.sleep(5000);
//          Outputs
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/ul/li[2]/a")).click();
          
//          Add Output item 
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div[1]/div/div/div/div[2]")).click();
          driver.findElement(By.id("item")).sendKeys("Final");
          driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div")).click();
		
          
        //*[@id="packaging"]
          driver.findElement(By.id("packaging")).click();
          driver.findElement(By.id("packaging")).sendKeys("bag");
          driver.findElement(By.xpath("//*[@id=\"packaging-multiselect-option-fa3e2c62-875e-47a3-a1de-4ad7f3955742\"]")).click();
          
//          Thread.sleep(5000);
          
          for (int i = 0; i < 5; i++) {
        	    // Enter Gross Weight
        	    driver.findElement(By.id("v-field-45")).sendKeys("220");

        	    // Enter Packaging Weight
        	    driver.findElement(By.id("v-field-47")).sendKeys("20");

        	    // Click Save Output
        	    driver.findElement(By.id("save-output")).click();

        	    // Wait for form to reload/prepare next entry
        	    Thread.sleep(2000);
        	}
//        	    Preview Button 
        	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/a")).click();
        	    
        	    Thread.sleep(20000);
//        	    Lock Buttton 
        	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/div/button")).click();
        	    
        	    Thread.sleep(8000);
//        	    Batch Approved Button
        	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
        	    
        	    Thread.sleep(8000);
//        	    Prodution Approve Button
        	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/div[1]/div[2]/button")).click();
        	}    
          
        	   
        	}
          
	


