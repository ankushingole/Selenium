package com.xpathPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:/Workspace/Selenium/config.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equals("ff")) {

			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("address_xpath"))).sendKeys(prop.getProperty("address"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("phone_xpath"))).sendKeys(prop.getProperty("phone"));

		driver.findElement(By.xpath(prop.getProperty("gender_xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("hobbies_xpath"))).click();

		driver.findElement(By.xpath(prop.getProperty("languages_xpath"))).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(prop.getProperty("sellanguages_xpath")))).click().build()
				.perform();

		Select sel = new Select(driver.findElement(By.xpath(prop.getProperty("skills_xpath"))));
		sel.selectByValue("Adobe Photoshop");

		Select sel1 = new Select(driver.findElement(By.xpath(prop.getProperty("country_xpath"))));
		sel1.selectByValue("India");

		driver.findElement(By.xpath(prop.getProperty("selcountry_xpath"))).sendKeys(prop.getProperty("sel_country"));

		Select year = new Select(driver.findElement(By.xpath(prop.getProperty("dob_year_xpath"))));
		year.selectByValue("1989");

		Select month = new Select(driver.findElement(By.xpath(prop.getProperty("dob_month_xpath"))));
		month.selectByValue("February");

		Select day = new Select(driver.findElement(By.xpath(prop.getProperty("dob_day_xpath"))));
		day.selectByValue("10");

		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));

		driver.findElement(By.xpath(prop.getProperty("conf_password_xpath")))
				.sendKeys(prop.getProperty("conf_password"));

		driver.findElement(By.xpath(prop.getProperty("submit_xpath"))).click();

		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		String expected = "http://demo.automationtesting.in/Register.html";

		if (actual.equals(expected)) {

			System.out.println("Form submitted successfully");

		} else {

			System.out.println("Form not submitted");
		}
		driver.quit();
	}

}
