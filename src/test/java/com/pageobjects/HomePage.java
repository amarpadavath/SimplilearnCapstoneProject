package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
	
	

	
	@FindBy(xpath = "//a[@id='dropdownMenu1']")
	WebElement OnName;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logOutBtn;
	
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//a[1]")
	
	WebElement viewBtm;
	
@FindBy(xpath = "//a[normalize-space()='Manage Product']")
	
	WebElement manageBtm;

public void clickOnManage() {
	manageBtm.click();
	}
	
	
	
	
	 public void waitForVisibility(WebElement element) {
			
		 wait = new WebDriverWait(driver,30);
       
              wait.until(ExpectedConditions.visibilityOf(element));
  }
	
	 
	 public void clickOnView()  {
	        // Initial loading, called when creating the page object to make sure that the page is loaded to a state where it is ready to interact with us, in our case it means that button is present in DOM and visible.
	        waitForVisibility(viewBtm);
		 viewBtm.click();
	        
	 }
	public void clickonName()
	{
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='dropdownMenu1']"))).click();
		
	}
	
	
	public void clickonLogOutbtn()
	{
		logOutBtn.click();
	}



	

}
