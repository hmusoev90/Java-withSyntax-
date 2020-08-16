package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {

		// getting data from existing file and writing into new

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/SimpleExcelFile.xlsx";

		FileInputStream fis = new FileInputStream(xlsFilePath);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet("Sheet1");

		sheet1.getRow(0).createCell(5).setCellValue("Result");
		sheet1.getRow(1).createCell(5).setCellValue("Passed");
		sheet1.getRow(2).createCell(5).setCellValue("Failed");
		sheet1.createRow(3).createCell(0).setCellValue("We're done");

		String newXLS = System.getProperty("user.dir") + "/TestData/Result.xlsx";
		FileOutputStream fos = new FileOutputStream(newXLS);
		workbook.write(fos);
		
		

	}
}
