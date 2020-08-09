package com.syntax.class25;

public final class FinalKeyword {

	public static String str = "Hello";
	public static final String USERNAME = "Admin";
	public final String PASSWORD = "Admin123";

	public static void main(String[] args) {

		System.out.println(str);
		str = "Hi";
		System.out.println(str);

		System.out.println(USERNAME);
		// USERNAME = "User123"; --> CE: variable is final and we cannot change it's
		// value

		FinalKeyword fk = new FinalKeyword();
		// fk.PASSWORD="User123"; --> CE: variable is final

	}

	public final void hello() {
		System.out.println("Hello everyone.");
	}
}

//class Baby extends FinalKeyword {
// @Override
// public void hello() {
//		System.out.println("");
//	}
//}		--> Final Classes can't be EXTENDED and final methods can't be ovverrided.
