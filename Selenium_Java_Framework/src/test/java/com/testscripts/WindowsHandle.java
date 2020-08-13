package com.testscripts;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.findElement(By.xpath("//span[contains(text(),'How Do I')]")).click();

		String parentWindowHandle = driver.getWindowHandle();
		// System.out.println(parentWindowHandle);
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String wh : allWindowHandles) {
			System.out.println(wh);

			if (!wh.equalsIgnoreCase(parentWindowHandle)) {
				String childWindow = wh;
				driver.switchTo().window(childWindow);
				String title = driver.getTitle();
				System.out.println("Child window title is: " + title);
				driver.switchTo().window(childWindow).close();

				driver.switchTo().window(parentWindowHandle);
				String title1 = driver.getTitle();
				System.out.println("Parent window title is: " + title1);
				driver.close();
			}
		}
	}
}
