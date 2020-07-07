package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC_06_Test_Launch_Browser {

	public static void main(String[] args) {
		String browserName = "Chrome";

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.twitter.com/");
		driver.quit();
	}

}
