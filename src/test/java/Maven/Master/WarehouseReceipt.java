package SatmaCE.Master;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class WarehouseReceipt {
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
		driver.findElement(By.xpath("//span[text()='Warehouse Receipt']")).click();
		
		// Step 3: Click Create New
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/div/a")).click();

//        Search From WT Number
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[1]")).click();

//        Click Approve 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[7]/div/div/div/a[2]/div[2]/span")).click();
       

        // Close browser
//        driver.quit();
    }
}