package com.syntax.class08;

import java.util.Scanner;

public class HW01 {
	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */

		System.out.println("Enter two integers, please:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int evenTotal = 0;
		int oddTotal = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0)
					evenTotal += i;
				else if (i % 2 == 1)
					oddTotal += i;
			}
		} else if (a >= b) {
			for (int i = b; i <= a; i++) {
				if (i % 2 == 0)
					evenTotal += i;
				else if (i % 2 == 1)
					oddTotal += i;
			}
		}
		System.out.println("Sum of all Even numbers: " + evenTotal);
		System.out.println("Sum of all Odd numbers: " + oddTotal);
	}
}
