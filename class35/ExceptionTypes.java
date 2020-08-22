package com.syntax.class35;

public class ExceptionTypes {
	public static void main(String[] args) {

		Thread.sleep(3000); // Checked exception

		String str = null;
		System.out.println(str.length()); // not Checked exception

	}
}
