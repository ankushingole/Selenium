package com.xpathPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String actual = driver.getTitle();
		String expected = "Facebook – log in or sign up1";

		if (actual.equals(expected)) {

			System.out.println("Correct title");
		} else {

			System.out.println("Incorrect title");
		}
	}

}
