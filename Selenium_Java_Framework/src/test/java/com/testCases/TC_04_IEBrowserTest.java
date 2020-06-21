package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC_04_IEBrowserTest {
	static WebDriver driver = null;

	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path + "/drivers/iedriver/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.dev/");
		driver.quit();

	}

}
