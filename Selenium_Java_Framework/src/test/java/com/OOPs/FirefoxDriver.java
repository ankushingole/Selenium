package com.OOPs;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("launch firefox browser");
	}

	public void get(String url) {
		System.out.println("launch url" + url);

	}

	public void findElement(String locator) {
		System.out.println("find elements" + locator);

	}

	public void close() {
		System.out.println("close browser");

	}

	public void quit() {
		System.out.println("quit all browsers");

	}

}
