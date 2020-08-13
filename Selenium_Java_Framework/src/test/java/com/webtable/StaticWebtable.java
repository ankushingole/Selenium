package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anki/Desktop/Webtable.html");

		List<WebElement> headers = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Total headers found: " + headers.size());

		for (WebElement colheaders : headers)
			System.out.println(colheaders.getText());

		driver.close();
	}

}
