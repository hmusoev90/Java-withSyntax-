package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsAge {

	public static void main(String[] args) {

		/*
		 * Take the age from user and then print if age is between 0-3 ---> you're baby
		 * if age is between 4-5 ---> you're kid if age is between 6-12 ---> you're
		 * child if age is between 13-19 ---> you're teenager if age is between 20-64
		 * ---> you're adult if age is more than or equal to 65 ---> Enjoy life:)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age, please:");
		int age = input.nextInt();

		if (age >= 0 && age <= 3)
			System.out.println("You're baby");
		else if (age >= 4 && age <= 5)
			System.out.println("You're kid");
		else if (age >= 6 && age <= 12)
			System.out.println("You're child");
		else if (age >= 13 && age <= 19)
			System.out.println("You're teenager");
		else if (age >= 20 && age <= 64)
			System.out.println("You're adult");
		else if (age >= 65)
			System.out.println("Enjo your life");
		else
			System.out.println("Age is out of range.");

	}
}
