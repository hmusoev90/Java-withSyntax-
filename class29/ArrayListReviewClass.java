package com.syntax.class29;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReviewClass {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// add(Object name) --> adds an element to existing ArrayList

		list.add("Khurshed");
		list.add("Safarbek");
		list.add("Ismoil");

		list.add("Safarbek");
		System.out.println(list);

		// add(int index, Object name) ---> method overloading

		list.add(2, "Murod");

		System.out.println(list);

		// remove(Object name) or remove(int indext)--> removes element
		list.remove("Safarbek");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);

		// indexOf(Object o) --> returns index of a given object -- int value

		System.out.println(list.indexOf("Murod"));
		System.out.println(list.indexOf("Safar"));

		// get(int index) --> retruns the object value

		System.out.println(list.get(0));

		// set(int index, Object o)

		list.set(2, "Akbar");
		System.out.println(list);

		// size() --> returns the number of objects inside the list

		System.out.println(list.size());

		// contain(Object o) ---> returns a boolean value

		System.out.println(list.contains("Safarbek"));

		// clear() --> deletes all objects inside the list and returns no value

		list.clear();
		System.out.println(list);
		for(int i=0; i<15; i++) {
			System.out.println("Break");
			System.out.println("yes");
		}
	}
}
