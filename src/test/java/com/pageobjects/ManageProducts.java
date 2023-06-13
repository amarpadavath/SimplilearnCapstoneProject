package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageProducts {
	
	
	
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	
	public ManageProducts(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='col-md-8']//input[@id='name']")
	
	WebElement name;
	
@FindBy(xpath = "//input[@id='brand']")
	
	WebElement brand;

@FindBy(xpath = "//div[@class='col-md-8']//textarea[@id='description']")

WebElement des;



@FindBy(xpath = "//input[@id='unitPrice']")


WebElement unitp ;



@FindBy(xpath = "//input[@id='quantity']")

WebElement quan ;


@FindBy(xpath = "//input[@id='file']")

WebElement upload ;



@FindBy(xpath = "//select[@id='categoryId']")

WebElement cat ;



@FindBy(xpath = "//form[@action='/medicare/manage/product']//div//div//input[@name='submit']")

WebElement save ;


@FindBy(xpath = "//td[contains(text(),'₹ 20')]")

WebElement p ;

@FindBy(xpath = "//td[normalize-space()='50']")

WebElement q ;

public String pricetext()
{
	return p.getText();
	
}

public String quatext()
{
	return q.getText();
	
}


public void entername()
{
	name.sendKeys("testname");
}

public void enterbrand()
{
	brand.sendKeys("testbrand");
}

public void enterdes()
{
	des.sendKeys("testdes");
}

public void enterunitp()
{
	unitp.clear();
	unitp.sendKeys("10");
}

public void enterquant()
{
	quan.clear();
	quan.sendKeys("50");
}


public   void enterunitp1(String a)
{

	unitp.clear();
	unitp.sendKeys(a);
}



public void enterquant1(String b)
{
	quan.clear();
	quan.sendKeys(b);
}

public void fileupload()
{
	upload.sendKeys("C:\\Users\\aswin\\Downloads\\download.jfif");
	
}

public void selectCat()
{
	Select drpCat = new Select(cat);
	
	drpCat.selectByIndex(2);
}

public  String selectCat1()
{
	Select drpCat = new Select(cat);
	
	drpCat.selectByIndex(4);
	WebElement o = drpCat.getFirstSelectedOption();
	String s = o.getText();
	return s;
	
}

public void clickonsave()

{
	save.click();
}


}
