package com.testCases;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC_16_ReadPropFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("D:/Workspace/Selenium_Java_Framework/config.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("url"));
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			Thread.sleep(2000);
		}

		else {

			driver = new InternetExplorerDriver();
			driver.get(prop.getProperty("url"));
		}

		driver.quit();

	}

}
