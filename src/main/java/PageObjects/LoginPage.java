package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver ) {
		PageFactory.initElements(driver, this);		
		System.out.println("-------------------------------- Inside LoginPage Constructor --------------------------------");
		System.out.println("changes for git test");
		this.driver = driver;
	}
	
	
	@FindBy (name="username") 
	@CacheLookup
	WebElement uname;
	
	@FindBy (name="password")
	@CacheLookup
	WebElement passwd;
	
	@FindBy (xpath="//button[@type ='submit']")
	@CacheLookup
	WebElement login_button;
	
//	@FindBy (xpath =  "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
//	WebElement dashboard_text;

	
	public void enterUserName(String username) {
		uname.clear();
		uname.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwd.clear();
		passwd.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		login_button.click();
	}
	
	public boolean verifyUserisOnHmepage() {
		WebElement pieChart = driver.findElement(By.xpath("//*[@style=\"display: block; box-sizing: border-box; height: 265px; width: 302px;\"]"));
		return pieChart.isDisplayed();
		
	}
	
	
}
