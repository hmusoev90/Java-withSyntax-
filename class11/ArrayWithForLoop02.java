package com.syntax.class11;

public class ArrayWithForLoop02 {
	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("- - - - - -");

		System.out.println("--- Printing using advanced loop ---");
		for (char element : grades) {
			System.out.print(element + " ");
		}
		
	}
}
