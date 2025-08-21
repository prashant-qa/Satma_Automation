package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Random;

public class Entities {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        // Step 1: Login
        driver.get("https://test.satmace.com/");
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);


        // Step 2: Navigate to Entities
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Entities")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        
        // Step 3: Generate Random Names
        Random random = new Random();
        String randomName1 = "Entity-" + random.nextInt(100000);
        String randomName2 = "ET-" + random.nextInt(100000);

        driver.findElement(By.id("name")).sendKeys(randomName1);
        driver.findElement(By.id("short_name")).sendKeys(randomName2);

        // Other Fields
        driver.findElement(By.id("phone_number")).sendKeys("9699030003");
        driver.findElement(By.id("email")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("secondary_phone_number")).sendKeys("9999999999");
        driver.findElement(By.id("website")).sendKeys("https://satmace.com");

        // Entity Type Dropdown
        WebElement entityType = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[1]/input"));
        entityType.click();
        driver.findElement(By.id("entity_type")).sendKeys("Individual");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]/ul/li[1]")).click();

        // Currency Dropdown
        driver.findElement(By.id("currency")).click();
        driver.findElement(By.id("currency")).sendKeys("Indian rupee");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[3]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]/ul/li[1]")).click();

        // Reporting Currency Dropdown
        driver.findElement(By.id("reporting_currency")).click();
        driver.findElement(By.id("reporting_currency")).sendKeys("Indian rupee");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]/ul/li[1]")).click();

        // Tax number & Effective Date
        driver.findElement(By.id("tax_number")).sendKeys("ADCPI2142L");
        driver.findElement(By.name("tax_number_effective_date")).sendKeys("2025-07-18");

        // Submit Form
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(8000);

        // Final confirmation
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[2]/button[1]")).click();

        // Screenshot - (Java selenium requires TakesScreenshot)
        /*
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot_after_save.png");
        FileUtils.copyFile(src, dest);
        */

        Thread.sleep(5000);
        driver.quit();
    }
}
