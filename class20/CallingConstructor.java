package com.syntax.class20;

public class CallingConstructor {

	/*
	 * Write a program that will have a constructor: one with parameters and second
	 * without any parameters. Create a separate Test class where you will execute
	 * both of the constructors 1 by 1.
	 */
	String s = "Hello";

	CallingConstructor() {
		System.out.println("Constructor #1");
	}

	CallingConstructor(String txt) {
		System.out.println("Constructor #2");
	}

}
