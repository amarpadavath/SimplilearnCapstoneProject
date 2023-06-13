Feature: Update feature
  Scenario Outline: Addmin is able to add products
	Given User1 is on Home Page
	When User1 Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User1 enters Email as "<email>" and Password as "<password>"
	And Click1 on Login
	Then Click on view
	And Click on edit in product detail page
	Then Update the quantity
	And Close the Browser

	
	  Examples:
    | email         | password |
    | vk@gmail.com 	| admin   |
    