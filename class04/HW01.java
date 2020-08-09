package com.syntax.class04;

import java.util.Scanner;

public class HW01 {
	public static void main(String[] args) {
		
		/*You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */
		
		System.out.println("Enter loan amount, please:");
		Scanner input = new Scanner (System.in);
		
		int loan = input.nextInt();
		
		if (loan<=200_000) {
			System.out.println("Congrats, you are eligible to get loan");
		}
		else {
			System.out.println("Sorry, but you're rejected");
		}
		
	}
}
