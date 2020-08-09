package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTask01 {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();

		cars.add("Toyota Camry");
		cars.add("Ford Fusion");
		cars.add("Kia Forte");
		cars.add("Chevy Malibu");
		cars.add("Tesla");
		cars.add("Ford Expedition");

		System.out.println(cars);

		System.out.println(" - - with ArrayList - -");
		for (String c : cars) {
			System.out.print(c + " ");
		}
		System.out.println();

		Iterator<String> crs = cars.iterator();
		System.out.println(" - - with Iterator - -");
		while (crs.hasNext()) {
			System.out.print(crs.next() + " ");
		}
	}
}
