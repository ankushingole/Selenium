package com.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class TC_25_SpecialLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		/*driver.findElement(
				new ByAll(By.className("inputtext _58mg _5dba _2ph-//"), By.id("u_0_m_9"), By.name("firstname")))
				.sendKeys("ANkush");
		*/		
		
		driver.findElement(new ByIdOrName(("u_0_m"))).sendKeys("Ankush");
	}
}