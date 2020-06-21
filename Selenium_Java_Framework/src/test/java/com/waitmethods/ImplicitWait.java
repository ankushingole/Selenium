package com.waitmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait{

	WebDriver driver;

	@Test
	public void demoWait() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		
		String message = text.getText();
		System.out.println("The text present is: " + message);
		
		driver.quit();

	}

}
