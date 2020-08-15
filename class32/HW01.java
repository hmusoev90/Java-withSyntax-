package com.syntax.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW01 {
	/* Create a map of Best Buy store. 
	 * Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
	 * Retrieve all keys and values from a Best Buy map using EntrySet
	 */
public static void main(String[] args) {
	
	Map<Integer, String> items= new HashMap<>();
	items.put(732032, "Laptop");
	items.put(432022, "Slim TV");
	items.put(932842, "Xbox");
	items.put(653057, "Printer");
	items.put(3210423, "Monitor");
	items.put(1932023, "MousePad");
	System.out.println(items);
	Set<Entry<Integer,String>> entries = items.entrySet();
	
	System.out.println(" -- EntrySet with Advanced For Loop -- ");
	for (Entry<Integer, String> entry : entries) {
		System.out.println(entry.getKey()+": "+entry.getValue());
	}
	System.out.println("\n -- EntrySet with Iterator -- ");
	 Iterator<Entry<Integer, String>> itEntries= entries.iterator();
	 while(itEntries.hasNext()) {
		 Entry entry = itEntries.next();
		 System.out.println(entry.getKey()+" :: "+entry.getValue());
		 System.out.println("----------");
	 }
	 
}
}
