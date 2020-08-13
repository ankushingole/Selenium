package com.mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Static.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		Actions act = new Actions(driver);

		WebElement sourceElement = driver
				.findElement(By.xpath("//div[@class='col-xs-10 col-xs-offset-2']//img[@id='node']"));
		WebElement targetElement = driver
				.findElement(By.xpath("//div[@class='col-xs-4 col-xs-offset-2']//div[@id='droparea']"));

		act.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		System.out.println("Drag and drop successful");
	}

}
