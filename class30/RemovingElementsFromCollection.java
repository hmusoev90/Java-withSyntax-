package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {

		// create an ArrayList with city names

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Midland");
		cities.add("Odessa");
		cities.add("Odessa");
		cities.add("Dallas");
		cities.add("Austin");
		cities.add("San Antonio");
		System.out.println(cities);

		System.out.println("- - Removing Objects from ArrayList using for loop - -");
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("Odessa") || cities.get(i).equals("Midland")) {
				cities.remove(i);
			}
		}
		System.out.println(cities);

		System.out.println(" - - Removing Objects from ArrayList using enhanced loop - -");

		/*
		 * for (String city : cities) { if (city.equals("Odessa")) {
		 * cities.remove(city); } }
		 */ // ConcurrentModificationException
		Iterator<String> citiesIT = cities.iterator();
		
		while(citiesIT.hasNext()) {
			String ct = citiesIT.next();
			if (ct.equals("Odessa") || ct.equals("Midland")) {
				citiesIT.remove();
			}
		}
		System.out.println(cities);
	}
}
