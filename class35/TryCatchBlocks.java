package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
	public static void main(String[] args) {

		String xlsFilePath = System.getProperty("user.dir") + "/TestData/Result";

		// FileNotFound exception
		try {
			FileInputStream fis = new FileInputStream(xlsFilePath);
		} catch (FileNotFoundException fne) {
			System.out.println("I caught the exception");
		}

		

		// ArrayOutOfBound exception

		int[] array = { 2, 3, 4, 5 };

		try {
			System.out.println("hello");
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("I caught ArrayIndexOutOfBoundException !");
		}
		
		System.out.println("End of the code");
	}
}
