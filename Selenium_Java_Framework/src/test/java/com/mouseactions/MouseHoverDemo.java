package com.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		Actions act = new Actions(driver);

		WebElement w1 = driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
		WebElement w2 = driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));

		act.moveToElement(w1).moveToElement(w2).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'Static')]")).click();

		// driver.quit();
	}

}
