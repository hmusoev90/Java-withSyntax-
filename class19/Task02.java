package com.syntax.class19;

public class Task02 {

	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name.
	 */
	public String str;

	public static String reverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
}
