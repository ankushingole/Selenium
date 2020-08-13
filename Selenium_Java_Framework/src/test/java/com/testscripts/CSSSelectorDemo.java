package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php/");

		// By tagName & id
		// driver.findElement(By.cssSelector("input#user_login")).sendKeys("Admin");

		// By tagName & attribute
		driver.findElement(By.cssSelector("input[id=user_login]")).sendKeys("Admin");

		// By tag, class & attribute
		driver.findElement(By.cssSelector("input.input[id = user_pass]")).sendKeys("demo123");

		// driver.findElement(By.cssSelector("input#wp-submit")).click();

		// By tagName & class
		driver.findElement(By.cssSelector("input.button.button-primary.button-large")).click();

		driver.close();

	}

}
