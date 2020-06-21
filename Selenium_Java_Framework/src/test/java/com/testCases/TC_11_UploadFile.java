package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_11_UploadFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		// System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://html.com/input-type-file/");
		Thread.sleep(2000);

		driver.findElement(By.id("fileupload"))
				.sendKeys("C:\\Users\\Anki\\Desktop\\CV & Cover Letter\\Skills for QA.txt");

		System.out.println("File uploaded successfully..!!!");

		driver.quit();
	}

}
