package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtableOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Anki/Desktop/Webtable.html");
 
		// Print total column for each row
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		for (int i = 2; i <= rows.size(); i++) {

			List<WebElement> allCols = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td"));
			System.out.println("Row " + (i - 1) + " has " + allCols.size() + " columns");
		}

		// Retrieve Salary of "tech"
		System.out.println("Salary of tech is: ");
		List<WebElement> rows1 = driver.findElements(By.xpath("//table/tbody/tr/td[text()='tech']/../td[2]"));
		for (WebElement w : rows1)
			System.out.println(w.getText());

		
		// Names have Salary>10000
		System.out.println("Names have Salary>10000: ");
		for (int i = 2; i <= rows.size(); i++) {
			WebElement salarycol = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]"));
			if (Integer.parseInt(salarycol.getText()) > 10000) {
				WebElement name = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]"));
				System.out.println(name.getText());
			}
		}

		
		// Sum of all Salaries
		int sum = 0;
		List<WebElement> salarycol = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement e : salarycol) {
			sum = sum + Integer.parseInt(e.getText());
		}
		System.out.println("Sum of all Salaries: " + sum);
		driver.close();
	}

}
