package com.syntax.class19;

public class Task02Access {
	public static void main(String[] args) {

		Task02 result = new Task02();
		result.str = "Hello World";
		String reverse= result.reverse(result.str);
		System.out.println(reverse);
	}
}
