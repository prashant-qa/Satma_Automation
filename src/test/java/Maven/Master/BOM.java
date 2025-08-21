package SatmaCE.Master;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BOM {

    WebDriver driver;

 // ✅ Method to generate a random BOM Name like "BOM-37485"
    public String generateRandomName() {
        return "BOM-" + (int)(Math.random() * 100000);
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://test.satmace.com/");

        Thread.sleep(3000);
        driver.findElement(By.id("v-field-1")).sendKeys("Prashant@satmace.com");
        driver.findElement(By.id("v-field-2")).sendKeys("Satma@201");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[5]/button")).click();
    }

    @Test
    public void fillBOMFormWithRandomName() throws InterruptedException {
    	Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/ul[1]/li[2]")).click();
        Thread.sleep(3000);
//        driver.findElement(By.partialLinkText("Bill Of Materials")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create New")).click();
        Thread.sleep(3000);

     // Generate and fill BOM name
        String bomName = generateRandomName();
        driver.findElement(By.id("name")).sendKeys(bomName);

        System.out.println("Filled BOM Name: " + bomName);
        
//      Dropdwon list ( Entity Type * )
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div/div/div[2]")).click();
      driver.findElement(By.id("item")).sendKeys("final");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
          if (option.getText().contains("Final Plastic")) {
              option.click();
              break;
          }
      }
      driver.findElement(By.id("v-field-7")).clear(); 
      driver.findElement(By.id("v-field-7")).sendKeys("1000");
      Thread.sleep(3000);
//      driver.findElement(By.id("v-field-9")).click();
      
      driver.findElement(By.id("v-field-9")).click();
      driver.findElement(By.id("v-field-9")).sendKeys("KG");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
          if (option.getText().contains("KGS")) {
              option.click();
              break;
          }
      }
      
//      Save Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div/div/form/div[2]/button")).click();
      
    //Dropdwon list ( process Type * )
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[1]/div/form/div[2]/div/div[2]/div/div/div/div[2]")).click();
      driver.findElement(By.id("process")).sendKeys("Recycling");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
        if (option.getText().contains("Recycling T1")) {
            option.click();
            break;
        }
      }
      
//      Process Save Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[1]/div/form/div[4]/button")).click(); 
      

    //Dropdwon list ( Input Item Name * * )
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]")).click();
      driver.findElement(By.id("item")).sendKeys("Red");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
        if (option.getText().contains("Red Plastic")) {
            option.click();
            break;
        }
      }
      
      driver.findElement(By.id("v-field-13")).clear();
      driver.findElement(By.id("v-field-13")).sendKeys("500");
      Thread.sleep(2000);

//      Add Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div/div[3]/div")).click();
      Thread.sleep(5000); 
      
    //Dropdwon list ( 2nd Input Item Name * * )
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]")).click();
      driver.findElement(By.id("item")).sendKeys("Green");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
        if (option.getText().contains("Green Plastic")) {
            option.click();
            break;
        }
      }
      
      driver.findElement(By.id("v-field-16")).clear();
      driver.findElement(By.id("v-field-16")).sendKeys("500");
      Thread.sleep(2000);

//      Add Button 
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div/div[3]/div/button")).click();
        
      driver.findElement(By.partialLinkText("Output")).click();
      Thread.sleep(6000);
      
      //Dropdwon list ( Output Item Name * * )
      driver.findElement((By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[1]/div/div/div/div[2]"))).click();
      driver.findElement(By.id("item")).sendKeys("Final");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
        if (option.getText().contains("Final Plastic")) {
            option.click();
            break;
        }
      }
      
      driver.findElement(By.id("v-field-19")).clear();
      driver.findElement(By.id("v-field-19")).sendKeys("1000");
      Thread.sleep(2000);
      
      //Dropdwon list ( Output Item Name * * )
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[1]/div[3]/div/div/div/div[2]")).click();
      driver.findElement(By.id("packaging")).sendKeys("Bag");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect__element"))) {
        if (option.getText().contains("Bag")) {
            option.click();
            break;
        }
      }
      
      //Dropdwon list ( Output Item Name * * )
      driver.findElement(By.id("output_type")).click();
      driver.findElement(By.id("output_type")).sendKeys("Plan");
      Thread.sleep(2000);
      // Find list of options and click the matching one
      for (WebElement option : driver.findElements(By.cssSelector("li.multiselect-option"))) {
        if (option.getText().contains("Planned")) {
            option.click();
            break;
        }
      }
      
//      Output Item Save button 
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/form/div[2]/button")).click();
      
//      Save &amp; Preview
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[3]/button/span[2]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[1]/div[2]/button")).click();
    }

//    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
