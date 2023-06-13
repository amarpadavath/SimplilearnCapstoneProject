package stepdefinition;




import com.common.BasePage;
import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.ManageProducts;
import com.pageobjects.ProductDetailPage;
import com.common.*;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition   {
	
	public LoginPage lp;
	public HomePage hp;
	public ManageProducts mp;
	
	public static WebDriver driver;
public static WebDriverWait wait;	
	

	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		//wait=new WebDriverWait(driver, 20);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		mp = new ManageProducts(driver);
		
		
		//driver.get("https://www.google.com");
		
	}
	@When("User Navigate to LogIn Page {string}")
	public void user_navigate_to_log_in_page(String URL) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(URL);
	}
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		  lp.sendusername(username);
		   lp.sendpassword(password);
	}
	@And("Click on Login")
	public void click_on_login() {
	  lp.clickbtn();
	}
	@Then("Page Tiltle should be {string}")
	public void page_tiltle_should_be(String title) {
		
		if(driver.getPageSource().contains("Username and Password is invalid!"))
		{
			driver.close();
			Assert.assertTrue(false);
			
		//	System.out.println("Testcase passed with invalid credential");
			
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	 
	}
	@When("User Click on Logout link")
	public void user_click_on_logout_link() {
		
		//  Alert alert = driver.switchTo().alert();
		//  alert.accept();
		
		
		
		hp.clickonName();
		hp.clickonLogOutbtn();
	
	}
	
	@Then("Verification of alert message")
	public void verification_of_alert_message() {
	    // Write code here that turns the phrase above into concrete actions
		  String exp1 = "Please enter your email!";
		  String exp2 = "Please enter your password!";
		  
	 String act1 = lp.mes1();
	 String act2 = lp.mes2();
	    
	    
	      //verify error message with Assertion
	      Assert.assertEquals(exp1, act1) ;
	      Assert.assertEquals(exp2, act2);
	}
	
	@Then("Verification of alert message of invalid email address")
	public void verification_of_alert_message_of_invalid_email_address() {
	    // Write code here that turns the phrase above into concrete actions
		  String exp1 = "Please enter a valid email address!";
		  
			 String act1 = lp.mes1();
			
			    
			    
			      //verify error message with Assertion
			      Assert.assertEquals(exp1, act1) ;
			    
	}

	@When("Close the Browser")
	public void close_the_browser() {
		
		driver.close();
	 
	}
	
	@When("Click on manage products")
	public void click_on_manage_products() throws Exception {
		Thread.sleep(3000);
		hp.clickOnManage();
	
	}
	@When("Give releventdata and click On save")
	public void give_releventdata_and_click_on_save() {
		
		mp.entername();
		mp.enterbrand();
		mp.enterdes();
		mp.enterunitp();
		mp.enterquant();
		mp.fileupload();
		mp.clickonsave();
	    
	}
	
	@When("Give1 releventdata")
	public void give1_releventdata() {
		
		mp.entername();
		mp.enterbrand();
		mp.enterdes();
		mp.enterunitp();
		mp.enterquant();
		mp.fileupload();
		mp.selectCat();
		
		
	    
	}
	
	@When("Give2 releventdata")
	public void give2_releventdata() {
		
	
		String f = mp.selectCat1();
		
		String q = "Antibiotics Achu";
		
		Assert.assertEquals(f, q, "testpassesd");
		
		
	    
	}
	@Then("Verify the product is added")
	public void verify_the_product_is_added() {
	    // Write code here that turns the phrase above into concrete actions
		boolean s = driver.getPageSource().contains("Product submitted successfully!");
		
		Assert.assertTrue(s);
	}
	
	
}
