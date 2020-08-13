package com.handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		String dob = "3-Apr-2020";
		String[] arr = dob.split("-");

		selectValueFromDropdown(day, arr[0]);
		selectValueFromDropdown(month, arr[1]);
		selectValueFromDropdown(year, arr[2]);

		Select select = new Select(day);
		List<WebElement> listDays = select.getOptions();
		int totalDays = listDays.size() - 1;
		System.out.println("Total days in list are:" + totalDays); 

		// How will you select the value with the help of getOptions()
		for (int i = 0; i < listDays.size(); i++) {
			String dayVal = listDays.get(i).getText();
			System.out.println(dayVal);
			if (dayVal.equals("16")) {
				listDays.get(i).click();
				break;
			}
		}

	}

	// Generic method for selecting value
	public static void selectValueFromDropdown(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	

}
