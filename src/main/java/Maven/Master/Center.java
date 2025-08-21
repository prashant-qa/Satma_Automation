package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Random;

public class Center {

    public static void main(String[] args) throws InterruptedException {
        
        // Chrome Driver Setup
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // Step 1: Login
        driver.get("https://test.satmace.com/");
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

        // Step 2: Controls & Master
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Centers")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Names
        Random random = new Random();
        String randomName1 = "Center-" + random.nextInt(100000);
        String randomName2 = "CT-" + random.nextInt(100000);

        driver.findElement(By.id("name")).sendKeys(randomName1);
        driver.findElement(By.id("short_name")).sendKeys(randomName2);

        // Step 4: Select Entity
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/form/div/div[2]/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("entity")).sendKeys("Test T1");
        driver.findElement(By.xpath("//*[@id=\"entity-0\"]/span/div/span")).click();

        // Step 5: Select Process
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/form/div/div[2]/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("process")).sendKeys("T1 Process");
        driver.findElement(By.xpath("//span[contains(text(),'T1 Process')]")).click();

        // Step 6: Checkbox click
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/form/div/div[2]/div[2]/div[3]/div/div/div/label")).click();

        // Step 7: Location
        WebElement location = driver.findElement(By.xpath("//input[@placeholder='Enter a location']"));
        location.sendKeys("Bandra Terminus, Mumbai");
        Thread.sleep(1000);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        // Step 8: Fill other fields
//        driver.findElement(By.id("postal_code")).sendKeys("400051");
//        driver.findElement(By.id("factory_license_number")).sendKeys("9999999999");

        driver.findElement(By.id("issuing_agency")).click();
        driver.findElement(By.id("issuing_agency")).sendKeys("Registrar");
        driver.findElement(By.xpath("//span[contains(text(),'Registrar')]")).click();

        // Step 9: License Dates
        driver.findElement(By.name("license_date")).click();
        driver.findElement(By.xpath("//*[@id='2025-07-28']")).click();

//        License Expiry Date *
        driver.findElement(By.name("license_expiry_date")).click();
        driver.findElement(By.xpath("//*[@id='2025-07-28']")).click();
        
//        Factory License Number *
        driver.findElement(By.id("factory_license_number")).sendKeys("9999999999");

        // Step 10: Submit
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[6]/div/div/div[2]/div/form/div/div[5]/button")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
