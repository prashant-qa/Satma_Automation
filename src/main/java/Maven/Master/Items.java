package SatmaCE.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class Items {
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


        // Step 3: Controls & Master -> Items
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Items")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        // Step 4: Fill form
        Random rand = new Random();
        String randomName = "granules-" + rand.nextInt(100000);
        driver.findElement(By.id("name")).sendKeys(randomName);

        // Type Dropdown
        driver.findElement(By.id("type")).click();
        driver.findElement(By.id("type")).sendKeys("Raw");
        driver.findElement(By.xpath("//*[@id='type-multiselect-option-78']/span")).click();

        // HSN Code
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("hsn_code")).sendKeys("39");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"hsn_code-0\"]/span/div/span")).click();

        // Toggle checkboxes
//        EPR Applicable
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[7]/div[1]/div/div/label/i")).click();
//        Consumable
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/label/i")).click();
//        Purchasable
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/div/label/i")).click();
//        Saleable
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[5]/div/div/div/label/i")).click();
       

        // COA Sales
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_sales")).sendKeys("COA Sale");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul/li[2]/span/div")).click();

        // COA Purchase
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_purchase")).sendKeys("COA Purchase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul/li[3]/span/div")).click();

        // COA Inventory
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_inventory")).sendKeys("COA Inventory");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"coa_inventory-0\"]/span/div/span")).click();

        // GST Outside State
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("inter_state_gst")).sendKeys("IGST 18%");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"inter_state_gst-0\"]/span/div/span")).click();

        // GST Within State
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("intra_state_gst")).sendKeys("GST 18%");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"intra_state_gst-0\"]/span/div/span")).click();

        // GST UT
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("intra_ut_gst")).sendKeys("UGST 18%");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"intra_ut_gst-0\"]/span/div/span")).click();

        // Unit Category
        driver.findElement(By.xpath("//*[@id=\"unit_category\"]")).click();
        driver.findElement(By.id("unit_category")).sendKeys("Mas");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"unit_category-multiselect-option-MASS\"]/span")).click();

        // Unit
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div[1]/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("unit")).sendKeys("KGS");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"unit-0\"]/span/div/span")).click();

        // Pricing fields
        driver.findElement(By.id("buy_price")).sendKeys("10");
        driver.findElement(By.id("buy_price_variance_percent")).sendKeys("1");
        driver.findElement(By.id("sale_price")).sendKeys("12");
        driver.findElement(By.id("sale_price_variance_percent")).sendKeys("1");

        driver.findElement(By.id("min_order_quantity")).sendKeys("50");
        driver.findElement(By.id("max_order_quantity")).sendKeys("200");
        driver.findElement(By.id("reorder_quantity")).sendKeys("170");
        driver.findElement(By.id("quantity_variance_percent")).sendKeys("1");

        Thread.sleep(2000);

        // Save & Preview
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[2]/button[1]/span[2]")).click();

              Thread.sleep(5000);
        driver.quit();
    }
}
