package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Review {
	public static void main(String[] args) throws IOException {
		
		
		String filePath ="TestData/ClassTask.xlsx";
		
		 FileInputStream fis= new FileInputStream(filePath);
		 
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet1 = workbook.getSheet("Sheet1");
		
		Row row0 = sheet1.getRow(0);
		String cell0 = row0.getCell(0).toString();
		String cell1 = row0.getCell(1).toString();
		
		Row row2 = sheet1.getRow(2);
		String B3= row2.getCell(1).toString();
		System.out.println(cell0+"\n"+cell1+"\n"+B3);
		
		
		
		
		
		
		
		
		
	}
}
