package com.syntax.class23;

public class MainMethodOverloading {

	public static void main(String str) {
		System.out.println("Hello" + str);
	}

	public static void main(String a, int b) {
		System.out.println("Number is " + b);
	}

	public static void main(String[] args) {
		System.out.println("I'm a main method with String array");
		main(" Hi");
		main("Hello", 5);
		System.out.println("\"Hello World\"");
	}
}
