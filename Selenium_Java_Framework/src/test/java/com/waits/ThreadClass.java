package com.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/SELENIUM SOFT/chromedriver.exe");
		// Opening a browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// Loading a URL
		driver.get("https://www.redbus.in/");
		
		
		// Locating and typing in From text box.
		WebElement fromTextBox = driver.findElement(By.id("src"));
		fromTextBox.sendKeys("Ban");
		System.out.println("Typed Ban");
		
		
		// Clicking on first search result
		Thread.sleep(-1000);
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		System.out.println("Selected Bangalore");
		
		
		// Closing browser
		driver.quit();
		System.out.println("browser closed");

	}
}
