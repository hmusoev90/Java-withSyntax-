package com.syntax.class04;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		
		/*Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and 
		 * print "The temperature in the city __ is __"
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your city, please:");
		
		String city = input.nextLine();
		
		System.out.println("Enter city temperature in Fahrenheit, please:");
		
		int temp = input.nextInt();
		
		double celcius = (temp-32)*5/9;
		System.out.println("The temperature in the city "+city+" is "+ celcius);
		
	}
}
