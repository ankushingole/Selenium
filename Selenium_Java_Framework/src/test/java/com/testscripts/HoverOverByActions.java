package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverByActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(2000);

		WebElement ws = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement ws1 = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ws).build().perform();
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		Actions ac = new Actions(driver);
		WebElement Clicktoadmin = driver.findElement(By.className("panelTrigger"));
		System.out.println("HELLO TESTNG" +" "+Clicktoadmin.getText());

		ac.moveToElement(Clicktoadmin).click().build().perform();

		driver.close();

	}
}
