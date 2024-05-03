@LoginPage
Feature: This is to verify the Login functionality for the OrangeHRM login page 

  Background: User is on Login page
    Given User opens the Web browser
    And User hits the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then User is redirected to the Login page with Title "OrangeHRM"


  Scenario Outline: Validate login functionality
    When User enter valid username as "<username>"
    And User enter valid password as "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |

