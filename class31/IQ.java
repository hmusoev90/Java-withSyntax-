package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ {

	public static void main(String[] args) {

		// How to remove all diplcates from ArrayList?

		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		Set<String> set = new LinkedHashSet<>(aList);
		System.out.println(set);

		// how to get/retrieve only 1 specific element?
		LinkedHashSet<String> countries = new LinkedHashSet<>();
		countries.add("Canada");
		countries.add("Russia");
		countries.add("Albania");
		countries.add("UK");
		countries.add("Argentina");

		List<String> list = new ArrayList<String>(countries);
		System.out.println(list.get(2));

	}
}
