package Maven.Master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Item {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // ✅ Auto-handles driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://test.satmace.com/");
        
        Thread.sleep(3000);
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[5]/button")).click();
    }

    @Test
    public void testItem() throws InterruptedException {

        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Item")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Item Test T3");
        driver.findElement(By.id("type")).click();
        driver.findElement(By.id("type")).sendKeys("Raw");
        driver.findElement(By.xpath("//*[@id=\"type-multiselect-option-78\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("hsn_code")).sendKeys("39");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[3]/ul/li[1]/span/div")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[7]/div[1]/div/div/label/i")).click();
  
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/div/label/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/label/i")).click();
        
//        Dropdwon list ( COA Sales )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_sales")).sendKeys("COA Sale");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("COA Sales account")) {
                option.click();
                break;
            }
        }
//        Dropdwon list ( COA Purchase )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_purchase")).sendKeys("COA Purchase");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("COA Purchase account")) {
                option.click();
                break;
            }
        }
        
//        Dropdwon list ( COA Inventory )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("coa_inventory")).sendKeys("COA Inventory");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("COA Inventory account")) {
                option.click();
                break;
            }
        }
        
//        Dropdwon list ( Outside State GST * )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[1]/div/div/div/div[2]")).click();
        driver.findElement(By.id("inter_state_gst")).sendKeys("IGST 18%");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("IGST 18%")) {
                option.click();
                break;
            }
        }
        
//        Dropdwon list ( Within State GST * )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div/div/div/div[2]")).click();
        driver.findElement(By.id("intra_state_gst")).sendKeys("GST 18%");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("GST 18%")) {
                option.click();
                break;
            }
        }
        

//        Dropdwon list ( Within Union Territory GST * )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[3]/div/div/div/div[2]")).click();
        driver.findElement(By.id("intra_ut_gst")).sendKeys("UGST 18%");
        Thread.sleep(2000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
            if (option.getText().contains("UGST 18%")) {
                option.click();
                break;
            }
        }
        
//        Dropdwon list ( Unit Category * )
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div[1]/div[2]/div[1]/div/div/div/div[1]/input")).click();
        driver.findElement(By.id("unit_category")).sendKeys("Mas");
        Thread.sleep(5000);
        // Find list of options and click the matching one
        for (WebElement option : driver.findElements(By.cssSelector("li.multiselect-option"))) {
            if (option.getText().contains("Mass")) {
                option.click();
                break;
            }
        }
        
//      Dropdwon list ( Unit * )
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div[1]/div[2]/div[2]/div/div/div/div[2]")).click();
      driver.findElement(By.id("unit")).sendKeys("KGS");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
          if (option.getText().contains("KGS")) {
              option.click();
              break;
          }
      }
      
      driver.findElement(By.id("buy_price")).sendKeys("10");
      driver.findElement(By.id("buy_price_variance_percent")).sendKeys("1");
      driver.findElement(By.id("sale_price")).sendKeys("12");
      driver.findElement(By.id("sale_price_variance_percent")).sendKeys("1");


      driver.findElement(By.id("min_order_quantity")).sendKeys("50");
      driver.findElement(By.id("max_order_quantity")).sendKeys("200");
      driver.findElement(By.id("reorder_quantity")).sendKeys("170");
      driver.findElement(By.id("quantity_variance_percent")).sendKeys("1");
      
//      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[2]/button[2]")).click();

      Thread.sleep(2000); // or better to use WebDriverWait

   // Click on Save & Preview button
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div[2]/form/div[2]/button[1]")).click();
   
    }
//
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
