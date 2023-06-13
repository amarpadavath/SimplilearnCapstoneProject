Feature: Login Feature
  Scenario Outline: Addmin is able to add products
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	And Click on manage products
	And Give2 releventdata 
	Then Verify the product is added
	And Close the Browser
	
	
	  Examples:
    | email         | password |
    | vk@gmail.com 	| admin   |
    
      Scenario Outline: Select different category
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	And Click on manage products
	And Give1 releventdata 
	
	And Close the Browser
	
	
	  Examples:
    | email         | password |
    | vk@gmail.com 	| admin   |