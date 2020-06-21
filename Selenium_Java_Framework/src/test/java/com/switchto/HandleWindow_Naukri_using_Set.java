package com.switchto;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindow_Naukri_using_Set {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@Test
	public void login() throws Exception {
		driver.get("https://www.naukri.com");

		// switch to naukri window
		String naukri_window = driver.getWindowHandle();
		// System.out.println("Parent window id is: " + naukri_window);

		Set<String> windows = driver.getWindowHandles();

		ArrayList<String> list = new ArrayList<String>(windows);

		driver.switchTo().window(list.get(1));
		System.out.println("Current window title is: " + driver.getTitle());
		driver.close();

		driver.switchTo().window(list.get(0));
		System.out.println("Parent Window URL is: " + driver.getCurrentUrl());
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
