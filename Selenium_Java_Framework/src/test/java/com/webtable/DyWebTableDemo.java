package com.webtable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyWebTableDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
		System.out.println("Webpage opened");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'markets')]")).click();
		System.out.println("clicked on markets tab");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Daily Share Prices')]")).click();
		System.out.println("clicked on daily share");
		Thread.sleep(5000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='gridSource']/tbody/tr"));
		System.out.println("table found");

		int totalrows = rows.size();
		for (int i = 1; i <= totalrows; i++) {
			WebElement w = driver.findElement(By.xpath("//table[@id='gridSource']/tbody/tr[" + i + "]/td[1]/a"));
			String sr = w.getText();
			if (sr.equals("ABB")) {
				System.out.println(w.getText());
			}

			for (int j = 2; j <= 8; j++) {
				List<WebElement> rowdata = driver
						.findElements(By.xpath("//table[@id='gridSource']/tbody/tr[" + i + "]/td[" + j + "]"));
				String st = rowdata.get(j).getText();

				System.out.println(st);

			}

		}

	}
}
