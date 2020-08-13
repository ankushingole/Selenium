package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertgetTitle {

	@Test()
	public void verifyTitle() {

		WebDriver obj = new FirefoxDriver();
		obj.get("https://opensource-demo.orangehrmlive.com/");
		obj.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		obj.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		obj.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String actResult = obj.getTitle();
		String expResult = "Google";
		Assert.assertEquals(actResult, expResult, "Title not found");
		obj.quit();

	}
}
