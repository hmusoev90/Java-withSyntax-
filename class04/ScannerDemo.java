package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {

		int a = 65;
		String s = "Hello everybody.";

		System.out.println("Please enter some txt here and press enter.");
		Scanner scan = new Scanner(System.in);
		String txt = scan.nextLine();
		System.out.println("------------");
		System.out.println(txt);
		
		// Let me read and integer (age)
		System.out.println("Enter age!");
		int age = scan.nextInt();
		System.out.println("The age taht you entered is "+age);
	}
}
