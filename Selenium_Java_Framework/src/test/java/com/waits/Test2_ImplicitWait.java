package com.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in");

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pun");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

		WebElement ele = driver.findElement(By.xpath("//ul/li[@ select-id='results[0]']"));
		ele.click();

	}

}
