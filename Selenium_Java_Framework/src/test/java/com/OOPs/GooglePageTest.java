package com.OOPs;

import org.testng.annotations.Test;

public class GooglePageTest {

	@Test
	public void titleTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement("id");
		driver.close();
		driver.quit();

	}

}
