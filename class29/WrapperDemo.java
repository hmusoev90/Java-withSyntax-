package com.syntax.class29;

public class WrapperDemo {

	public static void main(String[] args) {

		Integer num = 100; // Autoboxing
		String s1 = num.toString().concat("Hello");
		System.out.println(s1);

		Byte b = 10;
		System.out.println(b.MAX_VALUE);

		Boolean bl = true;

		Character ch = 'A';

		Double d = 10.99;

	}
}
