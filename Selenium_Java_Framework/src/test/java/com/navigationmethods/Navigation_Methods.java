package com.navigationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Navigation_Methods {

	WebDriver driver;

	@BeforeTest
	public void setUP() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.linkedin.com/");

	}

	@Test
	public void demo_NavigationMethods() {
		driver.findElement(By.xpath("//a[@class='sign-in-form__forgot-password']")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mail.com");

		driver.navigate().refresh();

		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);

		driver.navigate().forward();
		String title1 = driver.getTitle();
		System.out.println("Current page title is: " + title1);

	}

	

}
