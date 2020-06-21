package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver;

	@BeforeTest
	public void setUP() {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "testdata")
	public void myTest(String Username, String Password) {

		System.out.println(Username + " | " + Password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		// driver.findElement(By.id("btnLogin")).click();
	}

	@DataProvider(name = "testdata")
	public Object[][] getData() {
		String excelPath = "D:\\Workspace\\SeleniumJavaFramework\\excelfiles\\TestData.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	public Object[][] testData(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colcount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colcount];

		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < colcount; j++) {

				String cellData = excel.getCellDataString(i, j);
				// System.out.print(cellData + " | ");
				data[i - 1][j] = cellData;
			}
			System.out.println();
		}

		return data;
	}

}
