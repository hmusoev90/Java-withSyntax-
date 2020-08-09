package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW02 {
public static void main(String[] args) {
	
	/*
	 * Using scanner class create calculator. 
	 * Allow user to enter 2 numbers and 
	 * operator (+, -, *, /). Based on operator 
	 * provide the result to user.
	 */
	
	System.out.println("Enter any two numbers, please:");
	Scanner input = new Scanner(System.in);
	
	double a = input.nextDouble();
	double b = input.nextDouble();
	System.out.println("Enter the operator (+, -, *, /)");
	String txt = input.next();
	char operator = txt.charAt(0);
	
	switch(operator) {
	case '+':
		System.out.println(a+"+"+b+"="+(a+b));
		break;
	case '-':
		System.out.println(a+"-"+b+"="+(a-b));
		break;
	case '*':
		System.out.println(a+"*"+b+"="+(a*b));
		break;
	case '/':
		System.out.println(a+"/"+b+"="+(a/b));
		break;
		default:
			System.out.println("Wrong input.");
	}
	
	
}
}
