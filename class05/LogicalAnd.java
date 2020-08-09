package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		/*
		 * Declare a number. if number between 1-10 --> number is small Declare a
		 * number. if number between 11-100 --> number is big Declare a number. if
		 * number between 101-1000 --> number is large
		 */

		int num = 23;

		if (num >= 1 && num <= 10) {
			System.out.println(num + " is a small number.");
		} else if (num >= 11 && num <= 100) {
			System.out.println(num + " is a big number.");
		} else if (num >= 101 && num <= 1000) {
			System.out.println(num + " is large number");
		}
	}
}
