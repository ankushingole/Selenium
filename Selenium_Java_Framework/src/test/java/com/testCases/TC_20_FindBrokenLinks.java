package com.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_20_FindBrokenLinks {

	@Test
	public void brokenLinksTest() throws MalformedURLException, IOException ,Exception{

		WebDriver driver = null;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://maharashtra.gov.in/1125/Home/");
		

		// Get the list of all links and images:
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));

		System.out.println("Size of full links and images on webpage are: " + links.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();
		

		// Iterate linklist for all links and images:
		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getAttribute("href"));
			if (links.get(i).getAttribute("href") != null
					&& (!links.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(links.get(i));
			}
		}
		

		// get the size of active links:
		System.out.println("Size of active links is: " + activeLinks.size());
		

		// Check the href url with httpconnection API
		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();

			System.out.println(activeLinks.get(j).getAttribute("href") + "---> " + response);
		}

	}
}
