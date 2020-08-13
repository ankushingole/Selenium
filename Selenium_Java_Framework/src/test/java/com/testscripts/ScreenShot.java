package com.testscripts;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver; // downcasting

		File src = ts.getScreenshotAs(OutputType.FILE);

		// File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./Screenshot/ss.png"));

	}

}
