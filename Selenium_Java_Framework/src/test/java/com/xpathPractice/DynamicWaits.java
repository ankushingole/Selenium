package com.xpathPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWaits {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.skoda-auto.co.in/");

		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);

		//System.out.println("Page loaded");

	}

}
