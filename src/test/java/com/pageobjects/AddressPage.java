package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {
	
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	
	public AddressPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
	
	 public void waitForVisibility(WebElement element) {
		
		 wait = new WebDriverWait(driver,30);
       
              wait.until(ExpectedConditions.visibilityOf(element));
  }
	 @FindBy(xpath = "//a[@class='btn btn-primary']")
	 
	 WebElement selectBtn ;
	 
	 public void clcikOnSelect()  {
	        // Initial loading, called when creating the page object to make sure that the page is loaded to a state where it is ready to interact with us, in our case it means that button is present in DOM and visible.
	       // waitForVisibility(selectBtn);
	        selectBtn.click();
	        
	 }
	
	

	

}
