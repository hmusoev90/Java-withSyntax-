package com.syntax.class04;

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {

		
		/* As the customer to enter two numbers.
		 *  Compare the numbers and print which one is larger.
		 */
		System.out.println("Enter two digits, please:");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1st number:");

		int num1 = input.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " is greater than " + num1);

		} else {
			System.out.println("They are equal.");
		}
	}
}
