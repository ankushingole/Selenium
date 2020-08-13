package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignleave{

	@Test()
	public void assignLeave() throws Exception{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//b[contains(text(),\"PIM\")]")).click();

		WebElement ele = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
		ele.click();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sagar");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Tukaram");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patil");

		driver.findElement(By.xpath("//input[@id='photofile']")).click();
		Runtime.getRuntime().exec("C://Users//Anki//Desktop//FileUp.exe");
		/*
		 * driver.findElement(By.xpath("//input[@name='chkLogin']")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Sagar");
		 * driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("admin"
		 * );
		 * driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys("admin");
		 * 
		 * Select status = new
		 * Select(driver.findElement(By.xpath("//select[@id='status']")));
		 * status.selectByVisibleText("Enabled");
		 */

		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	}

}
