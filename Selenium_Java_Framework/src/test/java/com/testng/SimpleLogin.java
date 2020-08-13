package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleLogin {
	public static WebDriver driver = null;

	@BeforeMethod
	public void getUrl() throws Exception {
		driver = new FirefoxDriver();

		// Thread.sleep(2000);

	}

	@Test
	public void login() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(5000);

	}

	@Test(dependsOnMethods = "login")

	public void logOut() throws Throwable {
		Thread.sleep(1000);
		WebElement clicktoAdmin = driver.findElement(By.xpath("//a[contains(text(),\"Welcome Admin\")]"));
		clicktoAdmin.click();

		Actions ac = new Actions(driver);
		WebElement logOut = driver.findElement(By.xpath("//a[contains(text(), \"Logout\")]"));
		ac.moveToElement(logOut).click().build().perform();
		logOut.click();

	}

	/*
	 * @AfterMethod() public void closeBrowser() {
	 * 
	 * driver.close(); }
	 */

}
