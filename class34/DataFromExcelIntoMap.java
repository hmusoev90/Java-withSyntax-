package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {
	public static void main(String[] args) throws IOException {

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/SimpleExcelFile.xlsx";

		FileInputStream fis = new FileInputStream(xlsFilePath);

		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet("Sheet1");

		int rows = sheet1.getPhysicalNumberOfRows();
		int cols = sheet1.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlsList = new ArrayList<>();

		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				String key = sheet1.getRow(0).getCell(c).toString();
				String value = sheet1.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlsList.add(map);
		}
		System.out.println(xlsList);

		System.out.println("--- Printing Map 1 by 1 ---");
		for (Map<String, String> map : xlsList) {
			System.out.println(map);
		}
		System.out.println();
		
		for (int i=0; i<xlsList.size(); i++) {
			
		}

	}
}