package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	public static void main(String[] args) throws IOException {

		// 1. Identify path to the file you would like to read
		String filePath = "configs/Example.properties";

		// 2. Create an object of FileInputStream class

		FileInputStream fin = new FileInputStream(filePath);

		// 3. To work with property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fin);

		String value1 = prop.getProperty("username");
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);

	}
}
