package com.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		// Launch browser
		WebDriver driver = new FirefoxDriver();

		// enter url
		driver.get("https://www.redbus.in");

		// locate & type "pun" in searchbox
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pun");
		Thread.sleep(-3000);

		// click on pune from search result
		driver.findElement(By.xpath("//ul/li[@ select-id='results[0]']")).click();
		Thread.sleep(2000);

		// close the browser
		driver.close();
	}

}
