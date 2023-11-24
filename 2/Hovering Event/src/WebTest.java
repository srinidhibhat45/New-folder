// import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;


public class WebTest {
	public static WebDriver driver;
	public static String baseUrl = "https://app.e-box.co.in/uploads/base_projects/21077_index.html";
	public static String row1Before = "";
	public static String row2Before = "";
	public static String row3Before = "";
	public static String row4Before = "";
	public static String row1After = "";
	public static String row2After = "";
	public static String row3After = "";
	public static String row4After = "";
	
	
	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testWeb() throws Exception {
        
        	driver.get(baseUrl);
    
    String color1 = Color.fromString(driver.findElement(By.id("row1")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color1, "#000000");
    row1Before = color1;

    String color2 = Color.fromString(driver.findElement(By.id("row2")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color2, "#000000");
    row2Before = color2;
    
    String color3 = Color.fromString(driver.findElement(By.id("row3")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color3, "#000000");
    row3Before = color3;
    
    String color4 =  Color.fromString(driver.findElement(By.id("row4")).getCssValue("background-color")).asHex();      
    Assert.assertEquals(color4, "#000000");
    row4Before =color4;
    
    Actions act = new Actions(driver);
    
    act.moveToElement(driver.findElement(By.id("row1"))).build().perform();
    
    String color5 = Color.fromString(driver.findElement(By.id("row1")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color5, "#c8daf7");
    row1After = color5;
 
    act.moveToElement(driver.findElement(By.id("row2"))).build().perform();

    
    String color6 = Color.fromString(driver.findElement(By.id("row2")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color6, "#9df9ec");
    row2After = color6;
    
    act.moveToElement(driver.findElement(By.id("row3"))).build().perform();
    
    String color7 = Color.fromString(driver.findElement(By.id("row3")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color7, "#b2a0e8");
    row3After = color7;
    
    act.moveToElement(driver.findElement(By.id("row4"))).build().perform();

    
    String color8 = Color.fromString(driver.findElement(By.id("row4")).getCssValue("background-color")).asHex(); ;      
    Assert.assertEquals(color8, "#d8a0e8");
    row4After = color8;
      
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}

