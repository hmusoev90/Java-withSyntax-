package com.syntax.class35;

public class FinallyBlock {

	public static void main(String[] args) {

		String txt = "Java";

		try {
			System.out.println("I'm try block");
			char letter = txt.charAt(5);
			System.out.println(letter);
		} catch (Exception e) {
			System.out.println("I'm cathc block");
		} finally {
			System.out.println("I'm finally block");
		}

		System.out.println("I'm the end of the code");
	}
}
