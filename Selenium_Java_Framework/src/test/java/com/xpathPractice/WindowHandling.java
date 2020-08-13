package com.xpathPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		// Parent window
		String parentWindow = it.next();
		System.out.println("ParentWindow id:" + parentWindow);
		System.out.println("Current title is:" + driver.getTitle());

		// ChildWindow1
		String childWindow = it.next();
		System.out.println("ChildWindow id:" + childWindow);
		driver.switchTo().window(childWindow);
		System.out.println("Current title is:" + driver.getTitle());

		// ChildWindow2
		String childWindow2 = it.next();
		System.out.println("ChildWindow id:" + childWindow2);
		driver.switchTo().window(childWindow2);
		System.out.println("Current title is:" + driver.getTitle());
		driver.close();

		// switching to Childwindow1
		driver.switchTo().window(childWindow);
		driver.close();

		// switching back to Parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Current title is:" + driver.getTitle());

		driver.quit();

	}

}
