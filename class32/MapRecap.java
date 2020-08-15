package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {

	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(1, "Ivan");
		names.put(2, "Luis");
		names.put(3, "Kseniia");
		names.put(4, "Ahmet");
		names.put(5, "Olga");
		
		for (Integer key : names.keySet()) {
			System.out.println(key+"---"+names.get(key));
			
		}
	}
}
