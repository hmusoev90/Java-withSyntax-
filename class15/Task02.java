package com.syntax.class15;

public class Task02 {
	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */

		String txt = "Hello, what's up? 1233 %$@";

		txt = txt.replaceAll("[^A-z]", "");
		System.out.println(txt.length());
		

	}
}
