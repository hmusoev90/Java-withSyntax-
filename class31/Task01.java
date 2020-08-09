package com.syntax.class31;

import java.util.Iterator;
import java.util.TreeSet;

public class Task01 {
	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 * 
	 */
	public static void main(String[] args) {

		TreeSet<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("Russia");
		countries.add("Austria");
		countries.add("China");

		System.out.println("--- Using Advanced For Loop ---");
		for (String country : countries) {
			System.out.print(country + " ");
		}
		System.out.println();
		System.out.println("--- Using Iterator ---");
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			String country = it.next();
			System.out.print(country + " ");
		}
	}
}
