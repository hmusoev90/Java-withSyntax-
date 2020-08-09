package com.syntax.class23;

public class PrivateMethodOverloading {

	private void bye() {
		System.out.println("Bye");
	}

	private void bye(String str) {
		System.out.println(str);
	}

	private static String bye(String str, int num) {
		return str + num;
	}

	private static String bye(int a, int b) {
		return "Addition is " + (a + b);
	}

	public static void main(String[] args) {

		PrivateMethodOverloading obj = new PrivateMethodOverloading();
		obj.bye(); // "Bye"
		obj.bye("Hello World");
		System.out.println(bye("Number is ", 5));
		System.out.println(bye(2, 5));
	}
}
