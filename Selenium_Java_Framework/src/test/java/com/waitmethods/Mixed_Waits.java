package com.waitmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mixed_Waits{

	public static void main(String[] args) {

		WebDriver driver = null;

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1.Using implicitly wait
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("test automation");

		// 2.Using explicit wait
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement button = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='btnK']")));
		button.sendKeys(Keys.ENTER);

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(By.name("xyz")));
		// element.click();
		driver.quit();

	}

}
