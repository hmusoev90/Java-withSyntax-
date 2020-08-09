package com.syntax.class25;

public class SuperClass {

	protected static void enjoy() {
		System.out.println("I enjoy Sundays, maybe");
	}
}

class SubClass extends SuperClass {
	// this process called method hiding
	// @Override
	protected static void enjoy() {
		System.out.println("I enjoy everyday, maybe");
	}
}
