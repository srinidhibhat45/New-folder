package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.InputPage;
import pages.DisplayPage;;

public class TestCalculate {
    WebDriver driver;
    public static String url="http://app.e-box.co.in/uploads/Calculator_new.html";
	public static String h3Element,result1,result2,result3,result4;
	InputPage ipage;
	DisplayPage display;
	@BeforeTest
	public void launchDriver() {
		driver = new FirefoxDriver();
		driver.get(url);
		ipage = new InputPage(driver);
		display = new DisplayPage(driver);
	}

	//fill your code
	

	
}
