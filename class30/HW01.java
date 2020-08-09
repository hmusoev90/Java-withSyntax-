package com.syntax.class30;

import java.util.ArrayList;

public class HW01 {

	// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
	// with water.

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("juice");
		drinks.add("Shake Shack");
		drinks.add("Milk");
		drinks.add("Tomato juice");
		drinks.add("Chalov");

		for (int i = 0; i < drinks.size(); i++) {
			String drink = drinks.get(i);
			if (drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "Water");
			}
		}

		System.out.println(drinks);
	}
}
