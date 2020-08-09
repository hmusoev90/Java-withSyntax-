package com.syntax.class31;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntro {
	public static void main(String[] args) {

		// There are 4 Map Classes
		// 1. HashMap - doesn't preserve insertion order
		// 2. LinkedHaspMap - provides insertion order
		// 3. TreeMap - sort entry alphabetical by key
		// 4. HashTable - same as HashMap, but can have only 1 null key

		Map<String, String> country = new HashMap<>();

		System.out.println("-- HashMap doesn't prevent insertion order --");
		country.put("England", "London");
		country.put("USA", "Washington DC");
		country.put("Tajikistan", "Dushanbe");
		country.put("Russia", "Moscow");
		country.put("India", "New Dehli");
		System.out.println(country);

		System.out.println("-- LinkedHashMap provides insertion order --");
		Map<String, Double> groceries = new LinkedHashMap<>();
		groceries.put("Apple", 3.99);
		groceries.put("Milk", 2.99);
		groceries.put("Meat", 9.99);
		groceries.put("Bread", 1.27);
		groceries.put("Rice", 4.53);
		System.out.println(groceries);

		System.out.println("-- TreeMap sorts keys in ascending order --");
		Map<String, Double> shoppingList = new TreeMap<>(groceries);
		shoppingList.put("Chobani", 3.99);
		System.out.println(shoppingList);

		System.out.println("-- Printing all values 1 by 1 using loop --");
		Set<String> keys = shoppingList.keySet();

		for (String key : keys) {
			System.out.println(key + " and it's value is" + shoppingList.get(key));
		}
	}
}
