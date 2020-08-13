package com.xpathPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseoffindElements {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://retail.onlinesbi.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are:" + links.size());

		for (int i = 0; i < links.size(); i++) {
			String linkslist = links.get(i).getText();
			System.out.println(linkslist);
		}
	}
}
