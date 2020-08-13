package com.testscripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle_Naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is: " + parent);

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();
		System.out.println("Total windows count is:" + count);

		for (String wh : allWindows) {
			
			if (!parent.equalsIgnoreCase(wh)) {
				// String childWindow = wh;
				driver.switchTo().window(wh);
				System.out.println("Child window title is: " + driver.getTitle());
				System.out.println(wh);
				driver.close();
			}
		}

		driver.switchTo().window(parent);

	}

}
