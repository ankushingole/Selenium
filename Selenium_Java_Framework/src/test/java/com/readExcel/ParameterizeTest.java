package com.readExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelUtility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizeTest {

	WebDriver driver;

	@BeforeMethod
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	// Reading Excel data
	@Test
	public void readData() {
		Xls_Reader reader = new Xls_Reader(".\\excelfiles\\TestData.xlsx");
		int rowCount = reader.getRowCount("RegData");

		// Parameterization
		for (int row = 2; row <= rowCount; row++) {

			String firstName = reader.getCellData("RegData", "firstName", row);
			System.out.println(firstName);

			String surname = reader.getCellData("RegData", "surname", row);
			System.out.println(surname);

			String email = reader.getCellData("RegData", "email", row);
			System.out.println(email);

			String password = reader.getCellData("RegData", "password", row);
			System.out.println(password);
			System.out.println("***********");

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
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
