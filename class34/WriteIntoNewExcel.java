package com.syntax.class34;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoNewExcel {

	public static void main(String[] args) throws IOException {

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("New Sheet");
		sheet.createRow(0).createCell(0).setCellValue("I'm  new Cell Value created by Java codes");

		String newFilePath = System.getProperty("user.dir") + "/TestData/MyFile.xls";
		FileOutputStream fos = new FileOutputStream(newFilePath);
		workbook.write(fos);

	}
}
