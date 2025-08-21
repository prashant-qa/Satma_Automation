package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class Segregation {
    public static void main(String[] args) throws InterruptedException {

        // Chrome Driver Setup
    	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.satmace.com/auth/login");
		
		driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
		driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

        // Segregation Navigation
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Segregation']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();

        // Performed By
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[1]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("performed_by")).sendKeys("Prashant");
        driver.findElement(By.xpath("//*[@id=\"performed_by-0\"]/span/div/span")).click();

        // Male/Female count
        driver.findElement(By.id("male_count")).sendKeys("10");
        driver.findElement(By.id("female_count")).sendKeys("11");

        // Warehouse
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[1]/div[5]/div/div/div/div[2]")).click();
        driver.findElement(By.id("warehouse")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"warehouse-1\"]/span/div/span")).click();

        // Start Date
        driver.findElement(By.name("start_date")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"2025-08-13\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"start_date\"]/div[2]/div/div/div[3]/div[2]/button[2]")).click();

        // End Date
        driver.findElement(By.name("end_date")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"2025-08-13\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"end_date\"]/div[2]/div/div/div[3]/div[2]/button[2]")).click();

        // Submit main form
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/form/div[2]/button")).click();

        // Add segregation item
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/button[1]")).click();

        // GRN selection
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]")).click();
        driver.findElement(By.id("grn_line_item")).sendKeys("281");
        driver.findElement(By.xpath("//*[@id=\"grn_line_item-0\"]/span/div/span")).click();

        // 1st Item ( Segregated Item * )
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("item")).sendKeys("Test Z 004");
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();

//        Quantity *
        driver.findElement(By.id("v-field-24")).clear();
        driver.findElement(By.id("v-field-24")).sendKeys("10");
        
//        Packaging
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/form/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("packaging")).sendKeys("bale");
        driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
        
//        Save & Preview 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/form/button")).click();

        // 2nd Item
        driver.findElement(By.xpath("//*[@id='app']//div[3]/div[2]/div/div/form/div[2]/div[1]/div/div/div/div[2]/span")).click();
        driver.findElement(By.id("item")).sendKeys("Test T33");
        driver.findElement(By.xpath("//*[@id=\"item-0\"]/span/div/span")).click();

        driver.findElement(By.id("v-field-31")).sendKeys("10");
        
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/form/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("packaging")).sendKeys("bale");
        driver.findElement(By.xpath("//*[@id=\"packaging-0\"]/span/div/span")).click();
        
//        Save & Preview 
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[3]/div[2]/div/div/form/button")).click();

        // Preview
        driver.findElement(By.xpath("//*[@id='app']//div[2]/a")).click();

        // Approve
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div[2]/button[1]")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
