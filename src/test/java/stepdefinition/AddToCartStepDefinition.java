package stepdefinition;

import com.common.BasePage;
import com.pageobjects.AddToCart;
import com.pageobjects.AddressPage;
import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.ManageProducts;
import com.pageobjects.PaymentPage;
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
public class AddToCartStepDefinition {
	public static WebDriver driver;
//public static WebDriverWait wait;

	public LoginPage lp;
	public HomePage hp;
	public ProductDetailPage pdp;
	public AddToCart ac;
	public AddressPage ap;
	public PaymentPage pp; 
	public ManageProducts mp; 
	


@Given("User1 is on Home Page")
public void user1_is_on_home_page() throws Exception {
    // Write code here that turns the phrase above into concrete actions

	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	//wait=new WebDriverWait(driver, 20);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	lp = new LoginPage(driver);
	hp = new HomePage(driver);
	pdp = new ProductDetailPage(driver);
	ap = new AddressPage(driver);
	pp = new PaymentPage(driver);
	ac = new AddToCart(driver);
	mp = new ManageProducts(driver);
	
	//pdp = new ProductDetailPage(driver);
	//driver.get("https://www.google.com");
	
}
@When("User1 Navigate to LogIn Page {string}")
public void user1_navigate_to_log_in_page(String URL) {
    // Write code here that turns the phrase above into concrete actions
	driver.get(URL);
}
@When("User1 enters Email as {string} and Password as {string}")
public void user1_enters_email_as_and_password_as(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	  lp.sendusername(username);
	   lp.sendpassword(password);
}
@And("Click1 on Login")
public void click1_on_login() {
  lp.clickbtn();
}

@Then("Click on view")
public void click_on_view() throws Exception {
	Thread.sleep(7000);
 hp.clickOnView();
    
}

@Then("Click on edit in product detail page")
public void click_on_edit_in_product_detail_page() throws InterruptedException {
	Thread.sleep(7000);
	pdp.clcikOnedit();
	Thread.sleep(7000);
	mp.enterunitp1("20");
	mp.enterquant1("50");
	
	mp.clickonsave();
	

	
  
}
@Then("Update the quantity")
public void update_the_quantity() {
	
	System.out.println("Product price and quantity updated");
   
}


@Then("Click on Add to cart")
public void click_on_add_to_cart() throws Exception {
	//pd.explicitWait();
	
	Thread.sleep(7000);
	pdp.clcikOnAdd();;
   
}
@Then("Click on Checkout")
public void click_on_checkout() throws InterruptedException {

	Thread.sleep(7000);
	ac.clcikOnAdd1();

}
@Then("Select Address")
public void select_address() throws InterruptedException {
	
	Thread.sleep(7000);
	ap.clcikOnSelect();
  
}

@Then("Click on pay")
public void click_on_pay() throws InterruptedException {
	
	
	
	Thread.sleep(7000);
 pp.clickOnPay();
    
}
@Then("Verify product successfully ordered")
public void verify_product_successfully_ordered() {
	
	if(driver.getPageSource().contains("Your Order is Confirmed!!"))
			{
		
		
		System.out.println("successfully ordered product");
			}
	
	

}

@When("Close1 the Browser")
public void close1_the_browser() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
 
}
	
	

}
