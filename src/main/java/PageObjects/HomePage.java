package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("-------------------------------- Inside DashboardPage Constructor   -------------------------------");
		System.out.println("Added message on github repository");
	}
	
	
	@FindBy (xpath = "//div[@class='oxd-topbar-header-title']")
	WebElement dashboardHeader;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
			WebElement pimLink;
	
	@FindBy (xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	WebElement PIMheader;
	
	@FindBy(xpath ="//span[@class=\"oxd-userdropdown-tab\"]")
	WebElement userDropdown;
	
	@FindBy(xpath = "//ul[@class=\"oxd-dropdown-menu\"]/li/a")
	WebElement aboutLink;
	
	@FindBy(xpath="//h6[text()= \"About\"]")
	WebElement aboutPopupHeader;
	
	
	
	public boolean isRedirectedToDashboard() {
		boolean isDashboardHeaderDisplayed = dashboardHeader.isDisplayed();		
		return isDashboardHeaderDisplayed;
	}
	
	public void clickOnPIMlink() {
		pimLink.click();
	}
	
	public String verifyPIMheader() {
		String pimtitle = PIMheader.getText();
		return pimtitle;
	}
	
	public void clickOnUserDropdown() {
		userDropdown.click();
	}
	
	public void clickOnAboutMenuOption() {
		aboutLink.click();

	}
	
	public String verifyAboutPopupHeader() {
		return aboutPopupHeader.getText();
	}
	
	
	
}
