package com.syntax.class07;

public class Task01 {
	public static void main(String[] args) {

		// Print all odd numbers between 1 to 20 (included)
		int num = 1;
		System.out.println("Print all odd numbers between 1 to 20(included)");

		// 1st way
		while (num <= 20) {
			if (num % 2 == 1)
				System.out.print(num + " ");
			num++;
		}
		System.out.println();
		// 2nd way
		int num2 = 1;
		while (num2 <= 20) {
			System.out.print(num2 + " ");
			num2 += 2;
			;
		}
	}
}
