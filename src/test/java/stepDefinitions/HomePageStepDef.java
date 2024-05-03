package stepDefinitions;


import org.testng.Assert;

import PageObjects.AddEmployeePage;
import PageObjects.BaseClass;
import PageObjects.HomePage;
import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseClass{
	
	
	@Given ("User is on Homepage")
	public void user_is_on_dashboard_page() {
		homePage = new HomePage(Helper.getDriver());

	}
	
	@When ("User clicks on PIM option from left menu")
	public void user_clicks_on_PIM_option_from_left_menu() {
		homePage.clickOnPIMlink();
	} 
	
	@Then ("User is redirected to Employee Information page")
	public void User_is_redirected_to_Employee_Information_page() {
		String msg = homePage.verifyPIMheader();
		Assert.assertEquals(msg,"Employee Information");
	}
	

	
	
	
	@When("User clicks on user drop-down")
	public void user_clicks_on_user_dropdown(){
		homePage.clickOnUserDropdown();		
	}
	
	@And("User clicks on About menu option")
	public void user_clicks_on_About_menu_option() {
		homePage.clickOnAboutMenuOption();
		
	}
	
	 
	@Then ("About popup is displayed")
	public void about_popup_is_displayed() {
		Assert.assertEquals(homePage.verifyAboutPopupHeader(), "About");
	}
	 
	
	
	
	

}
