package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TC_04_IEBrowserTest {
 WebDriver driver = null;

	@Test
	public void ieBrowserTest() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path + "/drivers/iedriver/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.dev/");
		driver.quit();

	}

}
