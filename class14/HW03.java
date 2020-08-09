package com.syntax.class14;

import java.util.Scanner;

public class HW03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName = input.next();
		momName = momName.toUpperCase();
		System.out.println("Dad's first name?");
		String dadName = input.next();
		dadName = dadName.toUpperCase();
		System.out.println("Boy or Girl?");
		String gender = input.next();

		if (gender.equalsIgnoreCase("boy")) {
			System.out.println(dadName.substring(0,3)+momName.substring(momName.length()-2, momName.length()));
		}
		else if (gender.equalsIgnoreCase("girl")) {
			System.out.println(momName.substring(0,2)+dadName.substring(dadName.length()-3, dadName.length()));
		}
	}
}
