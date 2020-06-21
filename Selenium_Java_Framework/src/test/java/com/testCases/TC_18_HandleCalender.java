package com.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_18_HandleCalender {

	public static void main(String[] args) throws Exception {

		WebDriver driver = null;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("ingoleam89@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		System.out.println("Welcome to " + driver.getTitle());
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();
		driver.quit();
	}
}