package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task02 {

	/*
	 * Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 * 
	 */
	public static void main(String[] args) {

		LinkedHashSet<String> countries = new LinkedHashSet<>();
		countries.add("Canada");
		countries.add("Russia");
		countries.add("Albania");
		countries.add("UK");
		countries.add("Argentina");
		System.out.println(countries);
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			String country = it.next();
			if (country.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(countries);
	}
}
