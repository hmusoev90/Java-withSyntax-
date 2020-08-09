package com.syntax.class04;

import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {
		
		/*You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		System.out.println("Enter your age, please:");
		Scanner input = new Scanner (System.in);
		
		int age = input.nextInt();
		if (age>=18) {
			System.out.println("Yuppy, you're eligible to get driver license.");
		}
		else {
			System.out.println("Sorry, but you still can get learners permit.");
		}
	}

}
