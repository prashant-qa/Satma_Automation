package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class Machines {

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


        // Step 2: Navigate → Controls & Master → Machines
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Machines")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Machine Name
        Random random = new Random();
        String machineName = "Machine-" + random.nextInt(100000);
        driver.findElement(By.id("name")).sendKeys(machineName);

        // Step 4: Select Account Method
        driver.findElement(By.id("account_method")).click();
        driver.findElement(By.id("account_method")).sendKeys("First In - First Out");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/form/div/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/ul/li[1]/span")).click();

        // Step 5: Select Warehouse
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/form/div/div[1]/div/div/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai Warehouse");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Mumbai Warehouse T1')]")).click();

        // Step 6: Select Activity
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/form/div/div[1]/div/div/div[2]/div[4]/div/div/div/div[2]")).click();
        driver.findElement(By.id("activity")).sendKeys("Activity");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Activity T2')]")).click();

        // Step 7: Save First Part of Form
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/form/div/div[3]/button")).click();
        Thread.sleep(3000);

        // Step 8: Unit Dropdown
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div/form/div/div[1]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("unit")).sendKeys("KG");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'KGS')]")).click();

        // Step 9: Fill Other Fields
        
        driver.findElement(By.id("v-field-19")).clear();
        driver.findElement(By.id("v-field-19")).sendKeys("24");
        
        Thread.sleep(3000);
        driver.findElement(By.name("output_variance")).clear();
        driver.findElement(By.name("output_variance")).sendKeys("2");
        
        Thread.sleep(3000);
        driver.findElement(By.name("efficiency")).clear();
         driver.findElement(By.name("efficiency")).sendKeys("10");  // if needed
         
         Thread.sleep(3000);
        driver.findElement(By.id("operation_hours_per_day")).sendKeys("24");
        
        Thread.sleep(3000);
        driver.findElement(By.id("operation_days_per_month")).sendKeys("12");

        // Step 10: Final Save
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div/form/div/div[2]/button")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
