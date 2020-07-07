package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_05_Google_Browser_Test {
	static WebDriver driver = null;

	@Test
	public void googlePageTest() {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		
		// driver = new InternetExplorerDriver();
		//driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		System.out.println("Page title is: " + driver.getTitle());

		driver.close();
	}
}