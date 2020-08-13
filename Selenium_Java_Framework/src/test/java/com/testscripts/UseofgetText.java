package com.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseofgetText {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
//		WebElement innnertext = driver.findElement(By.xpath("//div/span[@class='Q8LRLc']"));
//		String str = innnertext.getText();
//		System.out.println(str);

		// get all languages text
		List<WebElement> langtext = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("Google supports below languages: ");
		for (WebElement w : langtext)
			System.out.println(w.getText());
		driver.quit();

	}

}
