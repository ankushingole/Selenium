package com.xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in");

		WebElement searchButton = new WebDriverWait(driver, 5).ignoring(TimeoutException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='search_btn']")));
		
		String text = searchButton.getText();
		System.out.println(text);

	}

}
