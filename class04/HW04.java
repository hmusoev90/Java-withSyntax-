package com.syntax.class04;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card (Yes=1/No=0");
		int answer = input.nextInt();

		if (answer == 1) {
			System.out.println("Enter your balance amount, please:");
			int balance = input.nextInt();
			if (balance>1000) {
				System.out.println("Please pay off immediately");
			}
			else {
				System.out.println("Keep shopping. Spend more money.");
			}
		} 
		else if (answer == 0) {
			System.out.println("You can get a credit card from us.");
		} 
		else
			System.out.println("Wrong input.");
	}
}
