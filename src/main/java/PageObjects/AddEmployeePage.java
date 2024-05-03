package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.github.javafaker.Faker;

public class AddEmployeePage {
	
	Faker faker = new Faker();
	WebDriver driver;
	
	public AddEmployeePage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	@FindBy (xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement addButton;
	
	@FindBy (xpath ="//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]")
	WebElement addEmpTitle;
	
	@FindBy (name= "firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement employeeId;
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	WebElement saveButton;
	
	@FindBy(xpath = "//*[text()=\"Abir Gulal\"]")
	WebElement empName;
	
	@FindBy(xpath = "//div[@class=\"orangehrm-edit-employee-image-wrapper\"]") 	
	WebElement  empImage;
	
	
	public void clickOnAddButton() {
		addButton.click();
	}
	
	public String getAddEmployeePageTitle() {
		String title = addEmpTitle.getText();
		return title;
	}
	
	
	public void enterFirstAndLastName(String fname, String lname) {
		firstName.clear();
		lastName.clear();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
	}
	
	public void enterEmployeeId() {
		int empId= faker.number().numberBetween(200, 3000);
		employeeId.clear();
		employeeId.sendKeys(""+empId);
	}
	
	public void clickOnSaveButton() {
		saveButton.click();
	}
	
	public boolean empImageisDisplayed() {
		
		boolean imgIsDisplayed = empImage.isDisplayed();
		return imgIsDisplayed;
	}
	
	public String VerifyEmpName() {
		return empName.getText();
	}
}
