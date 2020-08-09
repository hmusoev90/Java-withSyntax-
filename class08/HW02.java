package com.syntax.class08;

import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter item the want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * suer how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say "Thank
		 * you for shopping!
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter item you want to buy, please:");
		String item = input.nextLine();

		System.out.println("Enter item price, please:");
		double itemPrice = input.nextDouble();

		System.out.println("How much you want to pay?");
		double myPrice = input.nextDouble();
		double payMore = 0;
		while (itemPrice != myPrice) {
			if (itemPrice > myPrice) {
				System.out.println("Pay " + (itemPrice - myPrice) + " more, please:");
				payMore = input.nextDouble();
				itemPrice -= payMore;
			} else if (itemPrice < myPrice) {
				System.out.println("Here is your change: " + (myPrice - itemPrice));
				break;
			}
		}
		System.out.println("Thank you for shopping.");

	}
}
