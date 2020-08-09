package com.syntax.class14;

import java.util.Scanner;

public class HW02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String txt = input.nextLine();

		if (!txt.isEmpty()) {
			if (txt.length() % 2 != 0 && txt.length() >= 3) {
				System.out.println(txt.charAt(txt.length()/2));
			}
			else 
				System.out.println("Text has even numbers of characters.");
		} else {
			System.err.println("Text can't be empty");
		}
	}
}
