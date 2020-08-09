package com.syntax.class14;

public class StringClassMethods03 {
	public static void main(String[] args) {

		System.out.println("--- charAt() method ---");
		String txt = "Hello";
		char ch1 = txt.charAt(0);
		System.out.println(ch1);
		System.out.println();

		System.out.println("--- .indexOf() method ---");

		String txt1 = "What's up";
		int i1 = txt1.indexOf("'"); // returns integer value
		System.out.println(i1);
		int i2 = txt1.indexOf("i"); // returns -1, since there is no i letter
		System.out.println(i2);
		System.out.println();

		System.out.println("--- .substring() method ---");

		String txt2 = "Hey, What's up";
		String subtxt = txt2.substring(5, 11);
		System.out.println(subtxt);
	}
}
