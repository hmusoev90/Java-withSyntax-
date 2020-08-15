package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryInterface {
	public static void main(String[] args) {
		Map<String, Double> groceries = new LinkedHashMap<>();
		groceries.put("Apple", 3.99);
		groceries.put("Milk", 2.99);
		groceries.put("Meat", 9.99);
		groceries.put("Bread", 1.27);
		groceries.put("Rice", 4.53);
		System.out.println(groceries);

		Set<Entry<String, Double>> entries = groceries.entrySet();
		System.out.println("Set of Entry objects:" + entries);

		System.out.println("--- Retrieving key and value pair from Entry using for loop ---");
		for (Entry<String, Double> ent : entries) {
			System.out.println(ent.getKey() + "  --  " + ent.getValue());
		}

		System.out.println("--- Retrieving key and value pair from Entry using Iterator ---");
		Iterator<Entry<String, Double>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<String, Double> entry = it.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
