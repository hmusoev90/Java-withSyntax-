package com.syntax.class19;

public class HW {

	private static String displayVowels(String txt) {
		String s = txt.replaceAll("[^AaEeOoUuIi]", "");
		return s;
	}

	public static void main(String[] args) {
		System.out.println(displayVowels("Hello World"));

	}
}
