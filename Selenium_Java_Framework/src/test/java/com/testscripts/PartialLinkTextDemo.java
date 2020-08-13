package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		driver.findElement(By.partialLinkText("unt")).click();//partial LinkText
		
		driver.close();
	}

}
