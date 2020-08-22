package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {
	public static void main(String[] args) {

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/Result.xlsx";

		try {
			FileInputStream fis = new FileInputStream(xlsFilePath);
			fis.close();
			Workbook wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println(" - - - - - ");
	}
}
