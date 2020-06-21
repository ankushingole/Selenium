package com.waitmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

import com.google.common.base.Function;

public class WaitDemo_01 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = null;

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);

		//driver.findElement(By.xpath("//h3[contains(text(),'ABCD - NIMH Data Archive - NIH')]")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkelement = driver
						.findElement(By.xpath("//h3[contains(text(),'ABCD - NIMH Data Archive - NIH')]"));

				if (linkelement.isEnabled()) {
					System.out.println("Element found");

				}
				return linkelement;
			}
		});

		element.click();
		driver.close();
		driver.quit();
	}
}
