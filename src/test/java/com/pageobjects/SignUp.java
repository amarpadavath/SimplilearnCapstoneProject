package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {
	
	
	@FindBy(id = "firstName")
	WebElement firstName;
	
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(id = "email")
	
	WebElement emailId;
	
		@FindBy(id = "contactNumber")
	
			WebElement contactNumber;

		@FindBy(id = "password")

		WebElement pass;
		
		@FindBy(id = "confirmPassword")

		WebElement confirmPassword;
		
	
		@FindBy(xpath = "//*[@value='USER']")

		WebElement radioUser;
		
		@FindBy(xpath = "//*[@value='SUPPLIER']")

		WebElement radioSupp;
		
		
		@FindBy(xpath = "//*[@type='submit']")
		
		WebElement submitButton;
		
		
		public void sendFirsName()
		{
			
		}
		
		public void sendLastName()
		{
			
		}
		
		public void sendMobile()
		{
			
		}
		
		public void sendPassword()
		{
			
		}
		
		public void confirmPassword()
		{
			
		}
		
		public void selectUserRole()
		{
			
		}
		
		public void selectSuppRole()
		{
			
		}
	
		public void selectSubmitBtn()
		{
			
		}
	

}
