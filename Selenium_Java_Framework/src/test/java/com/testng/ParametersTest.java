package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "username", "password" })
	public void facebook_Login(String browser, String url, String username, String password) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);

		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys(username);

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);

		WebElement submit = driver.findElement(By.xpath("//input[@value='Log In']"));
		submit.click();
		
		String title=driver.getTitle();
		
		Assert.assertEquals("Facebook – log in or sign up", title);

		driver.quit();
	}

}
