package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task01 {
	public static void main(String[] args) {

		/*
		 * Create a map of countries with its capital that will store countries in
		 * alphabetical order. Print all keys and values from a country map using for
		 * each loop and iterator. Print all values from a country map using for each
		 * loop and iterator.
		 */

		Map<String, String> countries = new TreeMap<>();
		countries.put("England", "London");
		countries.put("Russia", "Moscow");
		countries.put("USA", "Washington DC");
		countries.put("Canada", "Otavva");
		countries.put("Austarlia", "Sydney");
		System.out.println(countries);
		System.out.println("-- With Advanced For Loop --");
		for (String key : countries.keySet()) {
			System.out.println(key + " " + countries.get(key));
		}

		Iterator<String> itKey = countries.keySet().iterator();

		System.out.println("------------ Printing keys and values with iterator ------------");
		while (itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + " -- " + countries.get(key));
		}

		System.out.println("-- Printing only values with Advanced for loop --");
		for (String value : countries.values()) {
			System.out.println(value);
		}

		System.out.println("-- Printing only values with Iterator --");
		Iterator<String> itValue = countries.values().iterator();
		while (itValue.hasNext()) {
			String value = itValue.next();
			System.out.println(value);
		}
	}
}
