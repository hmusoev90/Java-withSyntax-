package com.syntax.class11;

public class ArrayMaxNumber {
	public static void main(String[] args) {

		int[] numbers = { 4, 2, -3, 6, 1224, 434, 0 };
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println(max);
	}
}
