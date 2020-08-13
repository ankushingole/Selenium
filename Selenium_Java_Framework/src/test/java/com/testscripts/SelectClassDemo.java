package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByIndex(0);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel3 = new Select(year);
		sel3.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
	}

}
