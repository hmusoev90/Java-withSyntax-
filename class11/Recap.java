package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {

		int[] grades = new int[5];

		int size = grades.length;
		System.out.println("Array size:" + size);

		grades[3] = 47;
		grades[2] = 94;
		grades[4] = 100;
		grades[0] = 70;
		grades[1] = 85;

		// What is the average of the class?
		int total = 0;
		for (int i = 0; i <= grades.length - 1; i++) {
			total += grades[i];
		}
		System.out.println("Average:" + total / grades.length);
	}
}