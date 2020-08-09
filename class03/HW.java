package com.syntax.class03;

public class HW {
	public static void main(String[] args) {

		/*
		 * 1. Create a Java program and declare int variable that will hold a month.
		 * Based on the value of the variable your program should print the name of the
		 * month.
		 * 
		 * 2. Write a program to check whether number is positive or negative.
		 * 
		 * 3. Interview Question: Write a Java Program to check whether number is Even
		 * or Odd.
		 */

		int month = 10;

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Wrong input.");
		}
		
		System.out.println("- - - - - - - - - ");
		
		int number = 10;
		System.out.println(number>=0? "it's postivie" : "it's negative");
		
		System.out.println("- - - - - - - - - -");
		
		int div = 12;
		System.out.println(div%2==0? "it's divsible by 2": "it's not divisible by 2");

	}
}
