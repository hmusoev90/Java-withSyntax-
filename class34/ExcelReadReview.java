package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {
	public static void main(String[] args) throws IOException {

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/SimpleExcelFile.xlsx";
		FileInputStream fis = new FileInputStream(xlsFilePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet1 = workbook.getSheet("Sheet1");

		Row row2 = sheet1.getRow(1);
		String C2Value = row2.getCell(2).toString();
		System.out.println("C2 cell values: " + C2Value);

		int rows = sheet1.getPhysicalNumberOfRows();
		int cols = sheet1.getRow(0).getLastCellNum();

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String value = sheet1.getRow(r).getCell(c).toString();
				System.out.printf("%-10s\t", value);
			}
			if (r == 0) {
				System.out.print("\n------------------------------------------------------------------------");
			}
			System.out.println();
		}

	}
}
