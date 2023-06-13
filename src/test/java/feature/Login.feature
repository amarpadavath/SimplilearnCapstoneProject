Feature: Login Feature
  Scenario Outline: Successful Login with Valid Credentials 
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	Then Page Tiltle should be "Medicare - Home" 
	When User Click on Logout link
	Then Page Tiltle should be "Medicare - Login"
	And Close the Browser
	
  Examples:
    | email         | password |
    | kn@gmail.com  | 12345    |
    | vk@gmail.com	| admin    |
    
 Scenario Outline: Successful Login with InValid Credentials 
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	Then Page Tiltle should be "Medicare - Home" 
	When User Click on Logout link
	Then Page Tiltle should be "Medicare - Login"
	And Close the Browser
	
  Examples:
    | email         | password |
    | kn@gmail1.com  | 12345    |
    | vk@gmail.com	| admin3    |
    | vk@gmail23.com	| admin3    |
    
Scenario: Click on Login Button with out giving Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And Click on Login
	Then Verification of alert message
	And Close the Browser
	

    
    
    
  
 