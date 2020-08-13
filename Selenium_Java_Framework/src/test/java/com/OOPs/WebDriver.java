package com.OOPs;

public interface WebDriver {

	void get(String url);

	void findElement(String locator);

	public void close();

	public void quit();

}
