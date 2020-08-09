package com.syntax.class15;

public class Task01 {

	/*
	 * Create a String that will hold a sentence. Write a program to get a new
	 * String without any spaces.
	 * 
	 */
	public static void main(String[] args) {

		String txt = "Hello, what's up? 1233 %$@";

		txt = txt.replaceAll(" ", "");
		System.out.println(txt);
	}
}