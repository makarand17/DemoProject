package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	
	private static Helper helper;
	private static WebDriver driver;
	public final static int TimeOut= 20;
	
	private Helper() {
		System.out.println("-------------------------------- Inside Helper class constructor method  --------------------------------");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeOut));
				
	}
	
	//This method hit URL and open page
	public static void openPage(String url) {
		driver.get(url);
	}
	
	//This method return the driver instance
	public static WebDriver getDriver(){
		System.out.println("-------------------------------- Inside getDriver method  --------------------------------");
		return driver;
	}
	
	public static String verifyPageTitle() {
		return driver.getTitle();
	}
	
	
	
	public static void setUpDriver() {
		if(helper == null)
		helper = new Helper();		
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();			
		}
		helper = null;		
	}
	
	
	
	
	
	
	

}
