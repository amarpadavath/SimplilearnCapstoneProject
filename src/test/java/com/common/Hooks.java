package com.common;


import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

	@Before
	public void setupDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
	}

	@After
	public void quit() throws Exception {

		driver.quit();
	}

}