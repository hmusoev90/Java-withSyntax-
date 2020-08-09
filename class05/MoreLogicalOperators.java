package com.syntax.class05;

import java.util.Scanner;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		/*
		 * We have 7 days of week
		 * if day is 2,4 ---> SDLC class
		 * if day is 6,7 ---> Java Class
		 * if day is 1,5  ---> No class
		 * if day is 3 ---> Review Class
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any day of the week, please:");
		int day = input.nextInt();
		if (day==2 || day==2) {
			System.out.println("SDLC class");
		}
		else if (day==6 || day==7) {
			System.out.println("Java class");
		}
		else if (day==1 || day==5) {
			System.out.println("No class");
		}
		else {
			System.out.println("Wrong input.");
		}
		
		
	}
}
