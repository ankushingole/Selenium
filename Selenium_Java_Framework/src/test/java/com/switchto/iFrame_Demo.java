package com.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iFrame_Demo {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void switch_frames_Webelement() {

		driver.get("http://demo.automationtesting.in/");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		WebElement element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'SwitchTo')]")));

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='singleframe']")));

		driver.findElement(By.xpath("//input[@xpath='1']")).sendKeys("Selenium");

		System.out.println("Test case passed");

	}

	@Test(priority = 2)
	public void switch_frames_id() {

		driver.get("https://secure03b.chase.com/web/auth/dashboard#/dashboard/overviewAccounts/overview/index");

		driver.switchTo().frame("logonbox");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userId-text-input-field")));
		driver.findElement(By.id("userId-text-input-field")).sendKeys("admin");

		System.out.println("Test case passed");

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
