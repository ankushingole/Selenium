package com.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GMReadConfig {

	public static String getdata(String prop) throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\My Workspace\\Selenium Practice\\src\\com\\testscripts\\config.properties");
		
		Properties p = new Properties();   //creating reference variable
		p.load(fis);
		System.out.println(p.getProperty(prop));
		return prop;
	}
	

	public static void main(String[] args) throws IOException {

		GMReadConfig.getdata("uname");
		

	}

}
