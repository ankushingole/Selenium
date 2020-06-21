package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_14_findElements_Method {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2500, TimeUnit.SECONDS);

		driver.get("https://www.ebay.com/");

		List<WebElement> tags = driver.findElements(By.tagName("a"));

		// size of all links present on a webpage
		System.out.println(tags.size());

		// By using advanced for loop we can fetch all the link's text
		for (WebElement e1 : tags) {

			System.out.println(e1.getText());
		}

		driver.quit();
	}

}
