package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {
	public static void main(String[] args) {

		ArrayList<Country> countries = new ArrayList<>();
		countries.add(new USA("USA"));
		countries.add(new Tajikistan("Tajikistan"));
		countries.add(new Canada("Canada"));

		System.out.println("- - Using regular for loop - -");
		for (int i = 0; i < countries.size(); i++) {
			countries.get(i).election();
		}

		System.out.println("- - Using enhanced for loop - -");
		for (Country ctr : countries) {
			ctr.election();
		}

		System.out.println(" - - Using Iterator - - ");

		Iterator<Country> it = countries.iterator();

		while (it.hasNext()) {
			it.next().election();
		}
	}

}
