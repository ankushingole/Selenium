package com.waits;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in");

		WebElement fromTextBox= driver.findElement(By.id("src"));
		fromTextBox.sendKeys("Ban");
		
		// setting implicit time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Wait starts:"+new Date());
		System.out.println("Typed Ban");
		
		// Clicking on first search result
		driver.findElement(By.xpath("//li[@select-id='results[100]']")).click();
		System.out.println("Selected Bangalore");
		System.out.println("Wait ends:"+new Date());
		
		//Closing browser
		driver.quit();
		System.out.println("browser closed");
		
		
	}
}
