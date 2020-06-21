package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_28_DropDown_Part2 {
	static WebDriver driver = null;

	// Generic method to select values from dropdown
	public static void selectDropdownValue(String xpath_value, String value) {

		List<WebElement> yearList = driver.findElements(By.xpath(xpath_value));
		System.out.println(yearList.size() - 1 + " years");
		for (int i = 0; i < yearList.size(); i++) {
			String yearVal = yearList.get(i).getText();
			// System.out.println(yearVal);
			if (yearVal.equals(value)) {
				yearList.get(i).click();
				break;
			}
		}
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		String year_Xpath = "//select[@id='year']//option";

		// selecting values from dropdown w/o using Select class by using
		// generic method
		selectDropdownValue(year_Xpath, "2019");

		// driver.quit();
	}
}
