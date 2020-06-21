package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_26_Chrome_WebDriverManagerAPI {
	WebDriver driver=null ;

	@BeforeTest
	public void setUp() {
 //WebDriverManager.firefoxdriver().setup()
	//	Webdriver.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void testPageTitle() {
	//	driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void quitBrowser() {

		driver.quit();
		System.out.println("Browser closed");
	}

}
