package com.syntax.class18;

public class LocalVariables {

	public static void main(String[] args) {

		String name = "John Connor"; // name is local variable of main method
		for (int i = 1; i <= 5; i++) {
			System.out.println("Today is a Java Class");
			System.out.println(i);
		}
		// System.out.println(i); CE (Compiler Error) --> i cannot be resolved to a
		// variable
	}

	void displayName() {
		// System.out.println(name); CE ---> name cannot be resolved to a variable
		// name is not visible to the displayName methods because it local to main
	}

	int sum(int a, int b) {
		int sum = a + b; // sum is local variable of sum() method
		return sum;
	}
}
