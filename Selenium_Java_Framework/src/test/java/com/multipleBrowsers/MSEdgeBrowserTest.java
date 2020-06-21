package com.multipleBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MSEdgeBrowserTest {

	WebDriver driver = null;

	@Test

	public void googlePageTest() {

		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("htttps://www.google.co.in/");
		driver.quit();
	}

}
