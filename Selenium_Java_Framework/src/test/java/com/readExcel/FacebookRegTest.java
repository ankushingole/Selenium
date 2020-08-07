package com.readExcel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookRegTest {

	WebDriver driver;

	@BeforeMethod
	public void initBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtility.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void facebookRegTest(String firstName, String surname, String email, String password) {
		driver.findElement(By.id("u_0_m")).clear();
		driver.findElement(By.id("u_0_m")).sendKeys(firstName);

		driver.findElement(By.id("u_0_o")).clear();
		driver.findElement(By.id("u_0_o")).sendKeys(surname);

		driver.findElement(By.id("u_0_r")).clear();
		driver.findElement(By.id("u_0_r")).sendKeys(email);

		driver.findElement(By.id("u_0_u")).clear();
		driver.findElement(By.id("u_0_u")).sendKeys(email);

		driver.findElement(By.id("password_step_input")).clear();
		driver.findElement(By.id("password_step_input")).sendKeys(password);
	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

}
