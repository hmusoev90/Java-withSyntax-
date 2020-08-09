package com.syntax.class08;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	
	/*Create a program that will be asking user to apply
	 * for a credit card 10 times. As soon you get an “yes”
	 * from a user program should stop asking. 
	 */
	Scanner input = new Scanner(System.in);
	String answer;
	for (int i=1; i<=10; i++) {
		System.out.println("Do you wanna apply for credit card?");
		answer = input.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("Thank for applying.");
			break;
		}
	}
}
}
