package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchTextBox = driver.findElement(By.xpath("//div/input[@class='gLFyf gsfi']"));
				searchTextBox.sendKeys("Volvo cars");
// retrieving html attribute value using getAttribute() method
		String titleValue = searchTextBox.getAttribute("title");
		System.out.println("Value of title attribute: " + titleValue);
		String autocompleteValue = searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: " + autocompleteValue);
// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue = searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute attribute: " + nonExistingAttributeValue);
	}
}