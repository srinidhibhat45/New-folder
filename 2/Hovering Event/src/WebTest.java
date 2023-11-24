import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert.*;


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
        
		// Fill your code here
			
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
