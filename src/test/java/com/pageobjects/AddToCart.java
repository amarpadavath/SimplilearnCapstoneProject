package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {


	
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	
	public AddToCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-block']")
	WebElement checkOutBtn;
	
	 public void clcikOnAdd1()  {
	        // Initial loading, called when creating the page object to make sure that the page is loaded to a state where it is ready to interact with us, in our case it means that button is present in DOM and visible.
	       // waitForVisibility(checkOutBtn);
	        checkOutBtn.click();
	        
	 }
	
	
	 public void waitForVisibility(WebElement element) {
		 
		 wait = new WebDriverWait(driver,30);
       
              wait.until(ExpectedConditions.visibilityOf(element));
  }
	    
	
}
