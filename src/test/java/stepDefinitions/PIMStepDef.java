package stepDefinitions;

import org.testng.Assert;

import PageObjects.AddEmployeePage;
import PageObjects.BaseClass;
import Utilities.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMStepDef extends BaseClass {
	
	@When ("User clicks on Add button")
	public void user_clicks_on_Add_button() {
		addEmployeePage = new AddEmployeePage(Helper.getDriver());

		addEmployeePage.clickOnAddButton();
		
	}
	
	@Then ("User is displayed with Add Employee form")
	public void user_is_displayed_with_Add_Employee_form() {
		
		Assert.assertEquals(addEmployeePage.getAddEmployeePageTitle(), "Add Employee");
	}
	
	@And ("User enters Employee First name {string} and Last name {string}")
	public void user_enters_Employee_First_name_and_Last_name(String fname, String lname) {
		addEmployeePage.enterFirstAndLastName(fname, lname);
	}
	
	@And ("User enters Employee Id")
	public void user_enters_Employee_Id() {
		addEmployeePage.enterEmployeeId();
	}


	@And ("User clicks on Save button")
	public void user_clicks_on_Save_button() {
		addEmployeePage.clickOnSaveButton();
	}

	@Then ("User is successfully created and Personal details page appears")
	public void user_is_successfully_created_and_Personal_details_page_appears() {

		String empName = addEmployeePage.VerifyEmpName();
		Assert.assertEquals(empName, "Abir Gulal" );
		
	}
	

}
   