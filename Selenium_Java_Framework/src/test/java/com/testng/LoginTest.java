package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	WebDriver driver;

	SoftAssert assert1 = new SoftAssert();

	@BeforeMethod
	public void launch_Browser() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 1)
	public void login() {
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		uname.sendKeys("Admin");

		WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("admin123"); // assert1.assertEquals(true, false);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginBtn.click();

		boolean welcomeLogo = driver.findElement(By.xpath("//a[@class='panelTrigger']")).isDisplayed();
		assert1.assertTrue(welcomeLogo);
		assert1.assertAll();
		System.out.println("TC Passed- Login Successful");
	}

	@Test(priority = 2)
	public void logout() {

		WebElement uname = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		uname.sendKeys("Admin");

		WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		// assert1.assertEquals(true, false);

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginBtn.click();

		WebElement welcomeText = driver.findElement(By.xpath("//a[@class='panelTrigger']"));
		welcomeText.click();

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).click().build().perform();
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		assert1.assertEquals(actual, expected);
		System.out.println("TC Passed-Logout Successful");
		assert1.assertAll();

	}
	

	@AfterMethod
	public void close_Browser() {

		driver.quit();
	}
}
