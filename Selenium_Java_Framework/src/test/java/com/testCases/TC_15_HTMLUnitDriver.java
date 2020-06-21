package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_15_HTMLUnitDriver {

	public static void main(String[] args) {
		WebDriver driver;

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		driver = new ChromeDriver(options);

		// driver = new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Before Login Page title is: " + driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("After Login Page title is: " + driver.getTitle());
		driver.quit();
	}

}
