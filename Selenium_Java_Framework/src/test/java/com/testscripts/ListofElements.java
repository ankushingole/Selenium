package com.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListofElements {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		List<WebElement> ll = driver.findElements(By.tagName("a"));
		int size = ll.size();
		for (int i = 0; i <= size-1; i++) {

			System.out.println(ll.get(i).getText());
		}

	}

}
