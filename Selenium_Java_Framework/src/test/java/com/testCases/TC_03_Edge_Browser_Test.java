package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC_03_Edge_Browser_Test {
	WebDriver driver = null;

	@Test
	public void googlePage() {

		System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");

		driver = new EdgeDriver();
		driver.get("https://www.google.com/");

		driver.quit();
	}
}