package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php/");

		// Absolute Xpath
		WebElement ws = driver.findElement(By.xpath("/html/body/div/form/p/label/input[@id='user_login']"));
		ws.sendKeys("Admin");

		// Relative Xpath
		WebElement ps = driver.findElement(By.xpath("//input[@id='user_pass']"));
		ps.sendKeys("demo123");

	}

}
