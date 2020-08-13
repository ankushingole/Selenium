package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDropdown2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String days_xpath = "//select[@id='day']//option";
		String months_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";

		// Calling generic method
		selectValueFromDropdownList(days_xpath, "19");
		selectValueFromDropdownList(months_xpath, "May");
		selectValueFromDropdownList(year_xpath, "2020");

	}

	// Generic method for selecting value from list of values
	public static void selectValueFromDropdownList(String xpathValue, String value) {

		List<WebElement> list = driver.findElements(By.xpath(xpathValue));
		System.out.println("Total size is:"+list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals(value)) {
				list.get(i).click();
				break;
			}
		}

	}

}
