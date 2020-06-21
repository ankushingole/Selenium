package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_17_DynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook");

		List<WebElement> results = driver
				.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
		System.out.println(results.size());

		for (int i = 0; i < results.size(); i++) {

			System.out.println(results.get(i).getText());

			if (results.get(i).getText().equalsIgnoreCase("facebook logo")) {

				results.get(i).click();
				break;
			}
		}

		driver.quit();
	}

}
