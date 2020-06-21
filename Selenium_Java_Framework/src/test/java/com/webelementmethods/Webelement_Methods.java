package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webelement_Methods {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
//
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://cst2.marketingautomation.services/?_ga=2.182238692.251035104.1508333451-1692060673.1508333451");

	}

	@Test
	public void demoWebelementMethods() {



		driver.findElement(By.name("username")).sendKeys("ingoleam89@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.id("login-button")).click();

		String passText = driver.findElement(By.name("password")).getText();
		System.out.println("My Password is: " + passText);

		String mypasssword = driver.findElement(By.name("password")).getAttribute("placeholder");
		System.out.println("My attribute text is: " + mypasssword);

	}

	@AfterTest

	public void closeBrowser() {

		// driver.close();
		// driver.quit();
	}

}
