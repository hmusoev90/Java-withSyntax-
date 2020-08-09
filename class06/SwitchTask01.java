package com.syntax.class06;

import java.util.Scanner;

public class SwitchTask01 {
public static void main(String[] args) {
	/*
	 * Ask user to enter their country and capture
	 * it. Once values are captured print which language
	 *  user speaks.
	 */
	System.out.println("Enter your country, please:");
	Scanner input = new Scanner(System.in);	
	String country =input.nextLine();
	String lang = "Unknown";
	switch (country.toLowerCase()) {
	case "usa" :
	case "uk" :
		lang = "English";
		break;
	case "russia":
		lang = "Russian";
		break;
	case "turkey":
		lang = "Turkish";
		break;
	case "spain":
	case "mexico":
		lang = "Spanish";
		break;
	}
	System.out.println("You speak "+lang+" language.");
}
}
