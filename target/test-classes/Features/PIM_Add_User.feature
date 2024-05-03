@PIMAddUser
Feature: To vaidate add user functionality through PIM module

  Background: User has logged in successfully
    Given User opens the Web browser
    And User hits the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then User is redirected to the Login page with Title "OrangeHRM"
    And User is successfully logged in with valid username "Admin" and password "admin123"
    
	Scenario: To add new user through PIM module
		Given User is on Homepage
		And User clicks on PIM option from left menu
		Then User is redirected to Employee Information page
		When User clicks on Add button
		Then User is displayed with Add Employee form 	
		And User enters Employee First name "Abir" and Last name "Gulal"
		And User enters Employee Id
		And User clicks on Save button
		Then User is successfully created and Personal details page appears

