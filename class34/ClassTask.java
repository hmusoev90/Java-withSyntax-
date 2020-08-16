package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassTask {
	public static void main(String[] args) throws IOException {

		String filePath = "TestData/ClassTask.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet1 = workbook.getSheet("Sheet1");
		sheet1.createRow(2).createCell(0).setCellValue("AshleyAustin");
		sheet1.getRow(2).createCell(1).setCellValue("Austin1423");

		sheet1.createRow(3).createCell(0).setCellValue("MarkZuk");
		sheet1.getRow(3).createCell(1).setCellValue("Zuck0202");
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);

	}
}
