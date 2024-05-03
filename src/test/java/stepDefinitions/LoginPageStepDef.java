package stepDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass{
	

//----Step definitions for Background 
	
	@Test
	@Given("User opens the Web browser")
	public void user_opens_the_web_browser() {
		System.out.println("----------------------------- Inside user_opens_the_web_browser method   -------------------------------");

		 loginPage = new LoginPage(Helper.getDriver());
	}
	
	@And("User hits the URL {string}")
	public void user_hits_the_url(String url) {
		Helper.openPage(url);
	}

	@Then("User is redirected to the Login page with Title {string}")
	public void user_is_redirected_to_the_login_page_with_title(String title) {
		String pageTitleText = Helper.verifyPageTitle();
		Assert.assertEquals(pageTitleText, title);
	}
	
	
	

	@When("User enter valid username as {string}")
	public void user_enter_valid_username_as(String string) {
		loginPage.enterUserName(string);
	}

	@And("User enter valid password as {string}")
	public void user_enter_valid_password_as(String string) {
		loginPage.enterPassword(string);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("User is redirected to homepage")
	public void user_is_redirected_to_homepage() {
		
			homePage = new HomePage(Helper.getDriver());
			//String header = dashboardPage.getHomepageHeader();
			//Assert.assertEquals(header, "Dashboard");	
		boolean isDashboardHeaderDisplayed = homePage.isRedirectedToDashboard();
		Assert.assertEquals(isDashboardHeaderDisplayed, true);
	}
	
	@Given("User is successfully logged in with valid username {string} and password {string}")
	public void user_is_successfully_logged_in_with_valid_username_and_password(String uname, String passwd) {
		loginPage.enterUserName(uname);
		loginPage.enterPassword(passwd);
		loginPage.clickOnLoginButton();
		
	}
	

}
