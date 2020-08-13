package com.testscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		Runtime.getRuntime().exec("C://Users//Anki//Documents//Upload.exe");

		// TakeScreenShot method
		MultipleScreenShot.takeSS(new FirefoxDriver(), "sss1");
	}

}
