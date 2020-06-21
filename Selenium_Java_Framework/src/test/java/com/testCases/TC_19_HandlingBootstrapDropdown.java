package com.testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_19_HandlingBootstrapDropdown {

	@Test
	public void handleBootstrapDropdown() {

		WebDriver driver = null;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");

		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();

		List<WebElement> ddMenu = driver
				.findElements(By.xpath("//div[@class='dropdown show']//div[@class='dropdown-menu']//a"));
		System.out.println(ddMenu.size());

		for (WebElement webElement : ddMenu) {

			System.out.println(webElement.getText());
			System.out.println("#################");

			if (webElement.getText().contains("Another action")) {

				webElement.click();
			}

		}
		driver.quit();

	}

}
