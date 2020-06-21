package com.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo_01 {

	WebDriver driver = null;

	@Test
	public void alert() throws Exception {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.quit();
	}
}