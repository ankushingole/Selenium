package com.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropConfigFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:/Workspace/Selenium Class/src/com/testscripts/config.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("password"));

	}

}
