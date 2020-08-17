package com.syntax.class34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws IOException, InterruptedException {

		String xlsPath = System.getProperty("user.dir") + "/TestData/Homework.xlsx";
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("HomeWork");

		// Header Row
		sheet.createRow(0).createCell(0).setCellValue("Username");
		sheet.getRow(0).createCell(1).setCellValue("Password");

		// Row #1
		sheet.createRow(1).createCell(0).setCellValue("AppleInc");
		sheet.getRow(1).createCell(1).setCellValue("HelloWorld[]02");

		// Row #2
		sheet.createRow(2).createCell(0).setCellValue("GoogleCor");
		sheet.getRow(2).createCell(1).setCellValue("Play[]0202");

		// Row #3
		sheet.createRow(3).createCell(0).setCellValue("SyntaxHRM");
		sheet.getRow(3).createCell(1).setCellValue("Tester()03");

		// Row #4
		sheet.createRow(4).createCell(0).setCellValue("Oracle");
		sheet.getRow(4).createCell(1).setCellValue("Java()04");

		// Row #5
		sheet.createRow(5).createCell(0).setCellValue("Indeed");
		sheet.getRow(5).createCell(1).setCellValue("JobFinder()05");

		FileOutputStream fos = new FileOutputStream(xlsPath);
		workbook.write(fos);

		List<Map<String, String>> mapList = new ArrayList<>();

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();

		for (int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 1; c < cols; c++) {
				String key = sheet.getRow(r).getCell(0).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			mapList.add(map);
		}
		System.out.println(mapList);

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		for (Map<String, String> map : mapList) {
			Set<String> usernames = map.keySet();
			for (String username : usernames) {

				String password = map.get(username);

				WebElement login = driver.findElement(By.id("txtUsername"));
				WebElement pass = driver.findElement(By.id("txtPassword"));

				WebElement loginButton = driver.findElement(By.id("btnLogin"));

				login.sendKeys(username);
				pass.sendKeys(password);

				Thread.sleep(3000);
				loginButton.click();
				WebElement welcomeTxt = driver.findElement(By.xpath("//a[@id='welcome']"));

				WebElement logOutMenu = driver.findElement(By.xpath("//a[@id='welcome']"));
				WebElement logOut = driver
						.findElement(By.xpath("//a[@href='/humanresources/symfony/web/index.php/auth/logout']"));
				Thread.sleep(3000);
				String user = welcomeTxt.getText();
				System.out.println(user);

				logOutMenu.click();
				Thread.sleep(3000);

				logOut.click();

			}
		}
	}
}
