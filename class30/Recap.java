package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		// A collection that can save double objects and can have dublicates
		// and we would like to maintain the order

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(5.24);
		numbers.add(10.79);
		// numbers.add(5); CE --> we can't store Integer objs into ArrayList of Double
		// objs
		numbers.add(59.01);
		numbers.add(5.23);
		numbers.add(1.999);

		Double a = numbers.get(1);
		double b = numbers.get(2);// unboxing

		System.out.println(" - - Printing all Elements in ArrayList - - ");

		for (Double num : numbers) {
			System.out.print(num + " ");
		}

		System.out.println("\n- - Printing elements BackaWards - -");

		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.print(numbers.get(i) + " ");
		}

		System.out.println("\n- - Printing all values using Interator - - ");

		// next(); --> gets next Object
		// hasNext(); --> checks if there is next element
		// remove(); --> remove element from the collection
		Iterator<Double> it = numbers.iterator();
		double d = it.next(); // grabs 1st element
		double d1 = it.next(); // grabs 2nd element
		System.out.println(d1); // Prints 2nd element
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		Iterator<Double> doubleIT = numbers.iterator();
		while (doubleIT.hasNext()) {
			// double element = doubleIT.next(); // unboxing
			if (doubleIT.next() < 9) {
				doubleIT.remove();
			}
		}
	}
}
