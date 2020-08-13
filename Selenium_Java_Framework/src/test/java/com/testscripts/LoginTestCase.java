package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		/*
		 * WebElement userName = driver.findElement(By.id("txtUsername"));
		 * userName.sendKeys("Admin");
		 */

		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");

		/*
		 * WebElement password = driver.findElement(By.id("txtPassword"));
		 * password.sendKeys("admin123");
		 */

		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();

		driver.close();

	}

}