package com.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_21_MouseActions_Concept {
	WebDriver driver = null;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	// 1.Mouseover action
	@Test(priority = 1)
	public void mouseOver() {

		driver.get("http://mrbool.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Articles')]")).click();
	}

	// 2.DragAndDrop Action
	@Test(priority = 2)
	public void dragAndDrop() {
		
		driver.get("http://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

	// 3.Right click action
	@Test(priority = 3)
	public void rightClick() throws InterruptedException {
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2500);
		Actions act = new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		act.contextClick(rightClick).build().perform();

		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		String text = copy.getText();
		System.out.println(text);
		copy.click();

	}
}
