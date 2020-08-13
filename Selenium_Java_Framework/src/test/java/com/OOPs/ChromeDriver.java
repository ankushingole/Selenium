package com.OOPs;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Launch Chrome browser");
	}

	public void get(String url) {
		System.out.println("Launch url " + url);

	}

	public void findElement( String locator) {
		System.out.println("find elements by " + locator);

	}

	public void close() {
		System.out.println("Close browser");

	}

	public void quit() {

		System.out.println("Quit all browsers");

	}

}
