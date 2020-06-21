package com.switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo_03 {

	WebDriver driver = null;

	@Test
	public void prompt_alert() throws Exception {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());

		alert.sendKeys("Selenium Test Engineer");
		alert.accept();

		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("demo1")).getText());

		driver.quit();
	}
}