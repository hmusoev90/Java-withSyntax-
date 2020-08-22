package com.syntax.class35;

import java.util.Scanner;

public class CatchingException {
	public static void main(String[] args) {

		
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
			// trow new ArithmeticException();
		} catch (Exception ae) {
			System.out.println("Can't be devided by 0");
			// Exception ae = new ArithmeticException();
			// ae.printStackTrace();
			// System.out.println(ae);
			// System.out.println(ae.getMessage());
		}
		System.out.println("End of the code");
	}
}
