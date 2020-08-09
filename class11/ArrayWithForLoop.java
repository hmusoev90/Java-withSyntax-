package com.syntax.class11;

public class ArrayWithForLoop {
public static void main(String[] args) {
	
	String[] cities = {"San Antonio", "Dalass", "Odessa", "Midland", "NYC"};
	
	for (int i=0; i<cities.length; i++) {
		System.out.println("I live in "+cities[i]);
	}
}
}
