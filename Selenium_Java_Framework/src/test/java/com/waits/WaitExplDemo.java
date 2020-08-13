package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ankushingole007");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("19_imankush");

		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='veJvd snByac']"))).click();;
		
		//driver.findElement(By.xpath("//span[@class='veJvd snByac'")).click();
		
		driver.quit();

	}

}
