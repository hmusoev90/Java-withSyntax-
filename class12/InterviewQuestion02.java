package com.syntax.class12;

import java.util.Scanner;

public class InterviewQuestion02 {
	public static void main(String[] args) {

		// 2.Write a java program to check whether a given number is prime or not?

		System.out.println("Enter any number, please:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int div = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				div++;
			}
		}
		System.out.println(div > 2 ? "Not Prime" : "Prime");
	}
}
