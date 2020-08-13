package com.testscripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is: " + parent);

		Set<String> allWindows = driver.getWindowHandles();

		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		driver.switchTo().window(tabs.get(0));
		driver.close();

		driver.switchTo().window(tabs.get(1));
		driver.close();

	}

}
