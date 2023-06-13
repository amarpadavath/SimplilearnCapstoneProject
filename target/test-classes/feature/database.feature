Feature: Database Feature
  Scenario Outline: Successful Login with Valid Credentials 
	Given User connected database
	Given User is on Home Page
	When User Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	And Click on manage products
	And Give2 releventdata
	And Close the Browser
	
	
	  Examples:
    | email         | password |
    | vk@gmail.com 	| admin   |
	

	
