package com.syntax.class29;

import java.util.ArrayList;

public class Task {

	/*
	 * Create an ArrayList that will store 5 names into it. Find out whether the
	 * given ArrayList is empty or not? Check whether the specific name is present
	 * in an ArrayList or not? Find the size of your arrayList and print all values
	 * from that
	 */
	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<>();

		str.add("John");
		str.add("Murod");
		str.add("Jack");
		str.add("Emily");
		str.add("Farhod");

		System.out.println("Is Collection is empty: " + str.isEmpty());
		System.out.println("Collection contains \"John\":" + str.contains("John"));
		System.out.println("Collection size: " + str.size());
		System.out.println(str.get(5));// Exception in thread main

	}
} 
