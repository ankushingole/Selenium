package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_08_GoogleTitleTest {

	WebDriver driver = null;

	@Test
	public void titleTest() {
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("The title is: " + title);

		driver.quit();
		System.out.println("Test completed");
	}
}
