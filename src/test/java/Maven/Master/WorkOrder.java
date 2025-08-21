package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class WorkOrder {
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
        driver.findElement(By.xpath("//span[contains(text(),'Work Order')]")).click();
        Thread.sleep(2000);

        // 3. Create New
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a/span[2]")).click();
        Thread.sleep(2000);

     // Work Order Date
        driver.findElement(By.name("work_order_date")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"2025-08-13\"]/div")).click();
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);

        // Warehouse
        driver.findElement(By.xpath("//*[@id='app']//form/div/div[1]/div[3]//div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"warehouse-1\"]/span/div/span")).click();

        // Item
        driver.findElement(By.xpath("//*[@id='app']//form/div/div[1]/div[6]//div[2]")).click();
        driver.findElement(By.id("item")).sendKeys("Final");
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();

        // Item quantity & UOM
        driver.findElement(By.id("v-field-8")).sendKeys("1000");

        // Start Date
        driver.findElement(By.name("estimated_start")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"2025-08-13\"]/div")).click();
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);

        // End Date
        driver.findElement(By.name("estimated_end")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"2025-08-13\"]/div")).click();
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);

        // Auto BOM Select
        driver.findElement(By.xpath("//*[@id='app']//form/div/div[1]/div[8]//div[2]/span")).click();
        driver.findElement(By.id("bill_of_material")).sendKeys("Auto BOM 30");
        driver.switchTo().activeElement().sendKeys(Keys.SPACE);
        driver.findElement(By.xpath("//*[@id=\"bill_of_material-0\"]/span/div/span")).click();

        // Submit Button
        driver.findElement(By.xpath("//*[@id='button']")).click();
        Thread.sleep(10000);

        // Machine Selection
        driver.findElement(By.xpath("//*[@id='app']//form/div[2]/div/div[3]//div[2]/span")).click();
        driver.findElement(By.id("machine")).sendKeys("machine");
        driver.findElement(By.xpath("//*[@id='machine-0']/span/div/span")).click();

        // Machine Save Button
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

        // Save & Preview
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div[2]/div[3]/button")).click();

        // Approve
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div[1]/div[2]/button")).click();

        // Close Browser
        driver.quit();
    }
}
