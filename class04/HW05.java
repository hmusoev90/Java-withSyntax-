package com.syntax.class04;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of 
		 * worked years and annual salary. If user worked for
		 * more or equals to 5 years than user is eligible for 
		 * the bonus, otherwise he is not. Once user is eligible
		 * and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of worked years and annual salary");
		
		int workedYears = input.nextInt(); // declaring worked years
		double salary = input.nextDouble(); // declaring annual salary
		
		if (workedYears>=5) {
			System.out.println("You're eligible for bonus.");
			if (salary>50_000) {
				System.out.println("Your bonus is 5000");
			}
			else {
				System.out.println("Your bonus is 3000");
			}
		}
		else {
			System.out.println("You're not eligible for bonus.");
		}
	
	}
}
