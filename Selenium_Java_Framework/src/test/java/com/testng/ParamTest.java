package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParamTest {
	
	@Parameters({"username","password"})
	
	@Test()
	public void verifyLogin(String us, String ps) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(us);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ps);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
	
	

}
