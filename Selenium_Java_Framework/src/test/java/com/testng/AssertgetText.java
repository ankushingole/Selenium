package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertgetText {
	WebDriver obj = new org.openqa.selenium.chrome.ChromeDriver();
	SoftAssert asse = new SoftAssert();

	@Test(priority = 1)
	public void verifyText() {

		WebDriver obj = new FirefoxDriver();
		obj.get("https://www.seleniumhq.org/");

		WebElement title = obj.findElement(By.xpath("//a[@title=\"Get Selenium\"]"));

		String act = title.getText();
		String exp = "Download";
		asse.assertEquals(act, exp, "Test case failed");
	}

	@Test(priority = 2)
	public void get() {
		WebDriver obj = new FirefoxDriver();
		obj.get("https://www.seleniumhq.org/");

		WebElement title2 = obj.findElement(By.xpath("//a[@title=\"Technical references and guides\"]"));

		String act1 = title2.getText();
		String act2 = "Documentation";

		asse.assertEquals(act1, act2, "Test case failed");
		asse.assertAll();

	}

}
