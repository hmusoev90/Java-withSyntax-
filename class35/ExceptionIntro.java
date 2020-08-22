package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	public static void main(String[] args) throws FileNotFoundException {

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/MyFile.xlsx";
		// FileInputStream fis= new FileInputStream(xlsFilePath);

		// System.out.println(10/0); // will get ArithmeticException

		int[] arr = { 5, 12, 23 };
		System.out.println(arr[3]);// will get ArrayIndexOutOfBoundsException

		System.out.println("End of the code");
	}
}
