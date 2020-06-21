package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_27_DropDown_Part1 {

	// Generic method to select values from dropdown
	public static void selectDropdownValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}

	public static void main(String[] args) {
		WebDriver driver = null;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		// using array to enter direct value
		String dob = "28-Sept-1989";
		String dobArr[] = dob.split("-");

		// using generic method
		selectDropdownValue(day, dobArr[0]);
		selectDropdownValue(month, dobArr[1]);
		selectDropdownValue(year, dobArr[2]);

		Select sel = new Select(month);
		List<WebElement> monthList = sel.getOptions();
		System.out.println(monthList.size() - 1 + " months");

		for (int i = 0; i < monthList.size(); i++) {
			String monthVal = monthList.get(i).getText();
			System.out.println(monthVal);
			if (monthVal.equals("May")) {
				monthList.get(i).click();
				break;
			}
		}

		driver.quit();
	}
}
