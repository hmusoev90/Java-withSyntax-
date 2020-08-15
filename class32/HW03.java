package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW03 {
	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
		 * is more than 7 characters remove that city .
		 */

		String[] cities = { "Moscow", "Dushanbe", "New York", "Austin", "Midland" };

		Map<String, Integer> mapCities = new TreeMap<>();

		for (String city : cities) {
			mapCities.put(city, city.length());
		}
		System.out.println(mapCities);
		Set<String> setCity = mapCities.keySet();

		Set<Entry<String, Integer>> entrySet = mapCities.entrySet();

		System.out.println("-- with Iterator --");
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			int city = it.next().getValue();
			if (city > 7)
				it.remove();
		}
		System.out.println("Map after removal " + mapCities);

	}

}
