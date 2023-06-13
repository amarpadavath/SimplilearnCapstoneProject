package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BasePage;

public class LoginPage  {
	
	public static WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	
	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement passWORD;
	
	@FindBy(xpath = "//input[@value='Login']")
	
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[text()='Register Here']")
	
	WebElement regHere;
	
@FindBy(xpath = "//em[@id='username-error']")
	
	WebElement mes1;
public String mes1()
{
return mes1.getText();
}



@FindBy(xpath = "//em[@id='password-error']")

WebElement mes2;
public String mes2()
{
return mes2.getText();
}





	public void sendusername(String uname) {
	userName.sendKeys(uname);

	}

	public void sendpassword(String pwd) {
	passWORD.sendKeys(pwd);

	}

	public void clickbtn()
	{
	loginBtn.click();
	}

public void clicknewreg()
{
	regHere.click();
}


	
	

}
