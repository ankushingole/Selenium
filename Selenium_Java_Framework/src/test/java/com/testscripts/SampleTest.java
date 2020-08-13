package com.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM
		// SOFT\\chromedriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement welcometext = driver.findElement(By.xpath("//a[contains(text(),'Welcome Admin')]"));
		// System.out.println("found");
		String actual = welcometext.getText();
		String expected = "Welcome Admin";
		System.out.println("Welcome to OrangeHRM");
		Assert.assertEquals(expected, actual);

		// String mytitle = driver.getTitle();
		// System.out.println("title is: "+mytitle);
		// //WebElement welcomeText =
		// driver.findElement(By.xpath("//a[contains(text(),'Welcome
		// Admin')]"));
		
		// String expected = "OrangeHRM";
		// Assert.assertEquals(expected, mytitle);
		System.out.println("Test completed");
		driver.quit();

	}

}
