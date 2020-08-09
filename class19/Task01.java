package com.syntax.class19;

public class Task01 {

	/*
	 * Create a method that will accept an array as parameters and will return a sum
	 * of all elements from that array. Method should be visibly only within same
	 * package and accessible by the creating an instance of the class.
	 */
	protected int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}
