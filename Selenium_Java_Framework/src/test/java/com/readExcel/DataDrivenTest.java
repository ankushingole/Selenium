package com.readExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.excelUtility.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	WebDriver driver;

	@Test
	public void getExcelData() {

		// Excel code
		Xls_Reader reader = new Xls_Reader(".\\src\\main\\java\\com\\testdata\\FacebookRegDetails.xlsx");
		String firstName = reader.getCellData("RegData", " firstName", 2);
		System.out.println(firstName);

		String surname = reader.getCellData("RegData", "surname", 2);
		System.out.println(surname);

		String email = reader.getCellData("RegData", "email", 2);
		System.out.println(email);

		String password = reader.getCellData("RegData", "password", 2);
		System.out.println(password);

		// WebDriver code
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys(firstName);
		driver.findElement(By.id("u_0_o")).sendKeys(surname);
		driver.findElement(By.id("u_0_r")).sendKeys(email);
		driver.findElement(By.id("u_0_u")).sendKeys(email);
		driver.findElement(By.id("password_step_input")).sendKeys(password);

	}

}
