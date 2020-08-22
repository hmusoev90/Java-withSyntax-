package com.syntax.class35;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

/*Create a static method that will return a List of Exceptions.
 * Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
 * Call your method inside main and print name and details of all Exception objects.
 * 
 */
public class ClassTask02 {
	public static void main(String[] args) {

		List<String> list = listOfExceptions();
		for (String ls : list) {
			System.out.println(ls);
		}
	}

	public static List<String> listOfExceptions() {

		List<String> list = new ArrayList<>();

		// 1st Exception
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (Exception first) {
			// list.add("1st Exception: " + first.getMessage());
			list.add("1st Exception: " + first.toString());
		}

		// 2nd Exception
		int[] arr = { 5, 1, 0 - 3 };
		try {
			System.out.println(arr[4]);
		} catch (Exception second) {
			// list.add("2nd Exception: " + second.getMessage());
			list.add("2nd Exception: " + second.toString());
		}

		// 3rd Exception
		String txt = null;
		try {
			System.out.println(txt.length());
		} catch (Exception third) {
			// list.add("2nd Exception: " + third.getMessage());
			list.add("3rd Exception: " + third.toString());
		}

		// 4th Exception
		String xlsFilePath = "/TestData/MyFile";
		try {
			FileInputStream fis = new FileInputStream(xlsFilePath);
		} catch (Exception fourth) {
			// list.add("4th Exception: " + fourth.getMessage());
			list.add("4th Exception: " + fourth.toString());
		}

		return list;
	}
}
