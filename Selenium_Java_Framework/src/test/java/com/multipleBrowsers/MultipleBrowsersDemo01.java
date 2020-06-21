package com.multipleBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowsersDemo01 {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {

		System.out.println("Browser is: " + browserName);
		System.out.println("Thread id is: " + Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("Chrome")) {
			// System.out.println(projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");

			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
			driver = new FirefoxDriver(options);

		} else if (browserName.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void googlePageLoadTest() {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();
	}

}
