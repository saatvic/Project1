package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static Duration TIMEOUT=Duration.ofSeconds(30);
	public final static Duration PAGE_LOAD_TIMEOUT=Duration.ofSeconds(50);
	
	private SeleniumDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver=new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null)
			seleniumDriver=new SeleniumDriver();
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}	
	
}
