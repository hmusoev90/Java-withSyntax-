package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {

		// creating an object of HashSet

		HashSet<String> brands = new HashSet<>();
		brands.add("Nike");
		brands.add("Adidas");
		brands.add("H&M");
		brands.add("Zara");
		brands.add("Adidas");
		brands.add("Zara");
		System.out.println(brands);
		System.out.println(brands.size());

		Iterator<String> it = brands.iterator();
		String a = it.next();
		System.out.println(a);

		for (String brand : brands) {
			System.out.print(brand + " ");
		}

		while (it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
		}

		TreeSet<String> allBrands = new TreeSet<>(brands);
		allBrands.add("Calvin Clein");
		System.out.println(allBrands);

		System.out.println("---- Retrieving elements from TreeSet ----");
		Iterator<String> brandIterator = allBrands.iterator();
		while (brandIterator.hasNext()) {
			String br = brandIterator.next();
			System.out.println(br);
		}

		TreeSet<Double> numbers = new TreeSet<>();
		numbers.add(1.99);
		numbers.add(1.11);
		numbers.add(10.15);
		numbers.add(0.15);
		numbers.add(8.23);
		System.out.println(numbers);
	}
}
