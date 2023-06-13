package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage  {
	
	
	@FindBy(xpath =  "//h3[@class='text-center']")
	WebElement successMsg;

}
