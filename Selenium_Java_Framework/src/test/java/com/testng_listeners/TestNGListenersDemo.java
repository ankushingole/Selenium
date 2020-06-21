package com.testng_listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(com.listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	WebDriver driver;
	
	@Test 
	public void test1(){
		
		System.out.println("Inside test1");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("abc")).sendKeys("abcd");

	}

	@Test
	public void test2(){
		
		System.out.println("Inside test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3(){
		
		System.out.println("Inside test3");
		throw new SkipException("Test skipped");
	}
}
