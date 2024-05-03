@HomePage
Feature: TO verify the OrangeHRM Dashboard page

  Background: User is on Login page
    Given User opens the Web browser
    And User hits the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then User is redirected to the Login page with Title "OrangeHRM"
    And User is successfully logged in with valid username "Admin" and password "admin123"


Scenario: Validate the About popup on homepage

Given User is on Homepage
When User clicks on user drop-down
And User clicks on About menu option
Then About popup is displayed
 