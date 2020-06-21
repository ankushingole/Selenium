package com.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo_02 {

	WebDriver driver = null;

	@Test
	public void confirmationbox() throws Exception {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		// Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		System.out.println(driver.findElement(By.id("demo")).getText());

		driver.quit();
	}
}