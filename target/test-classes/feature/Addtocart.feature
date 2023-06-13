Feature: Add to cart 
  Scenario Outline: Add to cart is working fine with normal user
	Given User1 is on Home Page
	When User1 Navigate to LogIn Page "http://localhost:8088/medicare/login"
	And User1 enters Email as "<email>" and Password as "<password>"
	And Click1 on Login
	Then Click on view
	Then Click on Add to cart
	Then Click on Checkout
	Then Select Address
	Then Click on pay
	Then Verify product successfully ordered
	And Close1 the Browser
	
  Examples:
    | email         | password |
    | kn@gmail.com  | 12345    |