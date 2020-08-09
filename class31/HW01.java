package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW01 {
	/*
	 * 1.Create a map of a building. Store floor number and it is associated company
	 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
	 * keys and values. Check how many entries you have? Update company on a 4th
	 * floor Remove company on the 7th floor Print your map.
	 */
	// 2.Write code to get key and a value pair using Iterator

	public static void main(String[] args) {

		Map<Integer, String> building = new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Microsoft");
		building.put(4, "Apple");
		building.put(5, "Oracle");
		building.put(6, "Tesla");
		building.put(7, "Nokia");
		building.put(4, "Samsung");
		building.put(5, "Oracle");
		building.put(6, "Tesla");
		System.out.println(building);
		System.out.println("Entries: " + building.size());
		building.replace(4, "Apple");
		System.out.println("After replace: " + building);
		building.remove(7);
		System.out.println("After remove: " + building);

		Set<Integer> keys = building.keySet();

		System.out.println("-- Printing all values 1 by 1 using iterator");
		Iterator<Integer> itKeys = keys.iterator();
		while (itKeys.hasNext()) {
			int key = itKeys.next();
			System.out.println(key + " with value of " + building.get(key));
		}
	}
}
