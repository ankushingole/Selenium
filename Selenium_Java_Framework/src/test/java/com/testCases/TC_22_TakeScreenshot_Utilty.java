package com.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_22_TakeScreenshot_Utilty {
	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skoda-auto.co.in/");

		takeScreenshot("skoda-auto_homepage"); // using takescreenshot utility
		driver.quit();
	}

	public static void takeScreenshot(String fileName) throws IOException {

		// 1.Take screenshot and store it as a file format:
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// 2.Now copy the file to the desired location using copyfile method:
		FileUtils.copyFile(file, new File("/D:/Workspace/Selenium_Java_Framework/Screenshots/" + fileName + ".png"));
	}
}