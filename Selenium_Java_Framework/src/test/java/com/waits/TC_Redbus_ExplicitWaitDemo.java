package com.waits;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Redbus_ExplicitWaitDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in");

		WebElement ele1 = driver.findElement(By.xpath("//input[@id='src']"));
		ele1.sendKeys("ban");

		WebDriverWait wait = new WebDriverWait(driver, 25);

		System.out.println("Wait starts:" + new Date());

		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[@select-id='results[0]']"))));

		System.out.println("Wait starts:" + new Date());

		element.click();

		driver.quit();

	}

}
