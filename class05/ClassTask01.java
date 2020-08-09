package com.syntax.class05;

import java.util.Scanner;

public class ClassTask01 {

	public static void main(String[] args) {
		
		
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
			• short (under 60 inch)
			• medium(between 60 -72 inch)
			• tall (over 72 inch)
		 */
		System.out.println("Enter your height in inches, please:");
		Scanner input = new Scanner(System.in);
		
		double personHeight = input.nextDouble();
		
		if (personHeight>0 && personHeight<60) {
			System.out.println("You're short");
		}
		else if (personHeight>=60 && personHeight<=72) {
			System.out.println("Your height is medium");
		}
		else if (personHeight>72) {
			System.out.println("Wow, you're tall");
		}
		else {
			System.out.println("Wrong input");
		}
			
	}
}
