package com.syntax.class11;

public class ClassTask01 {
	public static void main(String[] args) {

		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "WaterMelon" };

		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}

		System.out.println();

		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
	}
}
