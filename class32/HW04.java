package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW04 {

	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve an employee who gets the highest salary. Output should be in the
	 * below format John Smith=$100000
	 * 
	 */
	public static void main(String[] args) {

		Map<String, Integer> employees = new LinkedHashMap<>();
		employees.put("John", 110_000);
		employees.put("Ashley", 95_000);
		employees.put("Jimmy", 65_000);
		employees.put("Samir", 130_000);
		employees.put("Alijon", 75_000);

		double high = 0;
		String key = "";
		for (String keys : employees.keySet()) {
			double value = employees.get(keys);
			if (value > high) {
				key = keys;
				high = value;
			}
		}
		System.out.println(key + "=$" + high);

	}
}
