package com.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10_StaleElementReference_Demo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		// System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// driver.findElement(By.id("btnLogin")).click();

		driver.navigate().refresh();

		driver.findElement(By.id("btnLogin")).click();

		driver.quit();
	}

}
