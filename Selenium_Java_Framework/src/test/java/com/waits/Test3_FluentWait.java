package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test3_FluentWait {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.uitestpractice.com/Students/Contact");
		driver.findElement(By.xpath("//a[contains(text(), 'This is a Ajax link')]")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));

		WebElement str = driver.findElement(By.xpath("//div[@class='ContactUs']"));
		String str1 = str.getText();

		if (str1.contains("framework")) {
			System.out.println("True");
		} else {

			System.out.println("NO ELEMENT FOUND");
		}

	}

}
