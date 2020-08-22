package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassTask01 {

	/*
	 * How would handle InputMismatchException? Input Mismatch Exception when user
	 * enters mismatch value then programmer expected.
	 * 
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		try {
			int num = input.nextInt();
			System.out.println(num);
		} catch (InputMismatchException ime) {
			System.out.println("Wrong input, enter only integer");
		}
	}
}
