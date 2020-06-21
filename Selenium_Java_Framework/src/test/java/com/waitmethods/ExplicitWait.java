package com.waitmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWait {

	WebDriver driver;

	@BeforeTest
	public void setup() {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void demoWait() {

		driver.navigate().to("http://the-internet.herokuapp.com/");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World!')]")));

		WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		String message = text.getText(); //
		System.out.println("The text present is: " + message);

		driver.quit();
	}

}
