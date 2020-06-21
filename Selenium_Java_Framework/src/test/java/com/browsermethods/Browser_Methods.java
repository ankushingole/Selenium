package com.browsermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Methods {

	static WebDriver driver;

	@Test
	public void demoBrowserMehtods() {

		System.setProperty("webdriver.chrome.silentOutput", "true");

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		String pageTitle = driver.getTitle();
		System.out.println("The page title is:" + pageTitle);

		String url = driver.getCurrentUrl();
		System.out.println("The url is:" + url);

		String pageSource = driver.getPageSource();
		System.out.println("The page source is:" + pageSource);

		driver.close();
		driver.quit();
	}

}
