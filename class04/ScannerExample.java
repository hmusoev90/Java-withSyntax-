package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		/*
		 * 1. Capture the name from the user and print ---> Your name is _____
		 * 
		 * 2. Ask the user to enter the age as double and print Your name is _____ and
		 * age is _______
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name, please:");
		String name = input.next();
		System.out.println("Your name is " + name);

		System.out.println("Enter your age, please:");
		double age = input.nextDouble();
		System.out.println("Your name is " + name + " and age is " + age);

	}
}
