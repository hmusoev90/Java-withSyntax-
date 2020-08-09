package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		// to add values to arrayList
		arrayList.add("hi");
		arrayList.add("Hello");
		arrayList.add("How are you?");

		System.out.println(arrayList.size()); // printing size of arrayList

		// printing particular element of ArrayList
		System.out.println(arrayList.get(2));

		// adding more elements to arrayList
		arrayList.add("I'm good, and you?");
		arrayList.add("Me too");
		System.out.println(arrayList.size());
		System.out.println("- - - Printing all elements of ArrayList - - -");
		for (String a : arrayList) {
			System.out.print(a + " : ");
		}
		System.out.println();
		// Removing element(s)
		arrayList.remove(0);
		System.out.println("New size of arrayList: " + arrayList.size());

		// I want to update value of "I am good, and you?" -->"Good, you?"
		arrayList.set(2, "Good and you?");
		System.out.println(arrayList);

	}
}
