package com.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_24_GetLogger {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(TC_24_GetLogger.class);

		WebDriver driver = new ChromeDriver();

		log.info("launching browser");

		driver.get("https://www.google.com");

		log.info("google url has launched");

		String title = driver.getTitle();
		System.out.println("Title value is:" + title);

		log.info("title value is:" + title);

		if (title.equals("Google")) {
			
			System.out.println("Title is correct ");
			log.info("Title is correct and test case is passed");
			
		} else {

			System.out.println("Title is incorrect");
			log.info("Title is incorrect and test case is failed");
		}

		driver.quit();

		log.info("Browser is closed");
	}

}
