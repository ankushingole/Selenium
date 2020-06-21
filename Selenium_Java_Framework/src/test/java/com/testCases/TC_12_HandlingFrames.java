package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_12_HandlingFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("packageFrame");   //switching to frame

		driver.findElement(By.linkText("Actions")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
