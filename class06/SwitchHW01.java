package com.syntax.class06;

import java.util.Scanner;

public class SwitchHW01 {
public static void main(String[] args) {
	
	/*
	 * Allow user to enter grade and the provide explanation:
	 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
	 * At the end your program should print which grade was entered by a user with explanation.
	 */
	System.out.println("Enter the grade, please:");
	Scanner input = new Scanner(System.in);
	String txt = input.next();
	char grade = txt.charAt(0);
	String result = "";
	switch (grade) {
	case 'A':
	result = "Excellent";
	break;
	case 'B':
		result = "Good";
		break;
	case 'C':
		result = "Average";
		break;
	case 'D':
		result = "Bad";
		break;
		default:
			result = "Not Acceptable";
	}
	
	System.out.println(grade+" "+result);
}
}
