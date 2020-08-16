package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	public static void main(String[] args) throws IOException {

		String filePath = "configs/Example.properties";

		FileInputStream fIn = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fIn);
		prop.setProperty("address", "625 E Vista Ridge Mall Dr");

		String newFile = "configs/NewFile.properties";

		FileOutputStream fOut = new FileOutputStream(newFile);

		prop.store(fOut, "Added additional key");
	}
}
