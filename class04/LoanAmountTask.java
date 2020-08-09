package com.syntax.class04;

import java.util.Scanner;

public class LoanAmountTask {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter loan amount, please:");

		int loan = input.nextInt();

		if (loan <= 200_000) {
			System.out.println("Yeah, we can provide loan for you.");
		} else {
			System.out.println("it's too much, loan is rejected.");
		}
	}
}
