package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_23_Handle_Basic_Auth_PopUp {

	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		String msg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		System.out.println(msg);

	}

}
