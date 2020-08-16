package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo {
	public static void main(String[] args) throws IOException {

		String xlsPath = "TestData/SimpleExcelFile.xlsx";

		FileInputStream fIn = new FileInputStream(xlsPath);

		Workbook workbook = new XSSFWorkbook(fIn);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row1 = sheet.getRow(0);

		Cell C1 = row1.getCell(2);
		String C1Value = C1.toString();

		System.out.println(C1Value);

		Cell A2 = sheet.getRow(1).getCell(0);

		String A2Value = A2.toString();
		System.out.println(A2Value);

	}
}
