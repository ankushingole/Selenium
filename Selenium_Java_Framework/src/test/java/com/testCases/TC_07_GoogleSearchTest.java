package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_07_GoogleSearchTest {

	static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

}
