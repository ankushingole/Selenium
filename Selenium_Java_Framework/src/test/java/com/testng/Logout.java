package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Logout {
	WebDriver driver=null;

	
	
	@Test()
	public void logout() throws Exception {
		
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),\"Welcome Admin\")]")).click();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

		Actions ac = new Actions(driver);
		ac.build().perform();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]"));
		logout.click();
		
		
		
		
		
		
	}
}
