@startPage2
Feature: performing signin

  Scenario: Redirect to Register page
    Given User is on SignIn page
    When User Clicks on Register link
    Then User should be redirected to Register page
    
 Scenario: Redirect to login  page
 Given User is on register page
 When  user click on loginbtn
 Then user in on loginpage
 
 Scenario Outline: User on login page and login with invalid inputs
 Given  The user is on signin page
 When  The user enter invalid "<username>" and "<password>"
 Then  click login button to verify
 
  Examples: 
      | username | password |
      | user     | password |
      |          |          |
      |          |          |
 
Scenario Outline: "User on login page and login with invalid and valid inputs from Excel"
Given The user is on login page
When The user enter sheet "<Sheetname>" and <RowNumber>
Then click login button

 Examples: 
      | Sheetname | RowNumber |
      | signin    |         0 |
      | signin    |         1 |
      | signin    |         2 |
      | signin    |         3 |


Scenario:  Verifying signout link
Given The user is in the Home page with valid  log in
When The user clicks "Sign out" 
Then The user redirected to homepage

 



 

 
    
 
 
 
