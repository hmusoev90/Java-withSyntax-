package com.syntax.class05;

import java.util.Scanner;

public class ClassTask04 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
			Example: if user is born in June, July or August ->season ="Summer".
			At the end of the program we should see 
			output as "You were born ______".
		 */
		
		System.out.println("Enter your birht month, please:");
		Scanner input = new Scanner(System.in);
		String month = input.next();
		
		if (month.equalsIgnoreCase("January") ||
			month.equalsIgnoreCase("February")||
			month.equalsIgnoreCase("December"))
			System.out.println("You were born in Winter");
		
		else if (month.equalsIgnoreCase("March")||
				month.equalsIgnoreCase("April")||
				month.equalsIgnoreCase("May"))
			System.out.println("You were born in Spring");
		
		else if (month.equalsIgnoreCase("June")||
				month.equalsIgnoreCase("July")||
				month.equalsIgnoreCase("August"))
			System.out.println("You were born in Summer");
		
		else if (month.equalsIgnoreCase("September")||
				month.equalsIgnoreCase("October")||
				month.equalsIgnoreCase("November"))
			System.out.println("You were born in Autumn");
		
		else
			System.out.println("Wrong input.");
		
		
	}
}
