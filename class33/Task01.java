package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task01 {

	/*
	 * Create a property file to store following configurations: browser=chrome
	 * url=https://facebook.com username password
	 * 
	 * Read file and extract values of browser & url
	 * 
	 */
	public static void main(String[] args) throws IOException {

		String filePath = "configs/urlInfo.properties";

		FileInputStream fIn = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fIn);
		
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		System.out.println(browser + "\n" + url);
	}
}
