package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_13_CustomXpath {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java",Keys.ENTER);

		driver.quit();
	}

}
