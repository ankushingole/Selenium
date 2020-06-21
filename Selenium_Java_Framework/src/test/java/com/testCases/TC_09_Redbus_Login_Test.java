package com.testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_09_Redbus_Login_Test {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void login() throws Exception {
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Sign In/Sign Up')]")).click();

		// switching to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);

		// clicking facebook login button
		driver.findElement(By.xpath("//div[@id='newFbId']")).click();

		// switch to facebook window
		String redbus_window = driver.getWindowHandle();
		System.out.println("Parent window id is: " + redbus_window);

		Set<String> windows = driver.getWindowHandles();

		for (String child_window : windows) {

			if (!redbus_window.equalsIgnoreCase(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("Child Window title is: " + driver.getTitle());

				driver.findElement(By.name("email")).sendKeys("anku4148");
				driver.findElement(By.name("pass")).sendKeys("imankush");
				driver.findElement(By.name("login")).click();
				
				System.out.println("Current page title is: " + driver.getTitle());

			}
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
