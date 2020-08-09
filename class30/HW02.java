package com.syntax.class30;

import java.util.ArrayList;

public class HW02 {
	public static void main(String[] args) {

		// Create an arrayList of even numbers from 1 to 50.
		// Remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> evenNumbers = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
			}
		}
		System.out.println(evenNumbers);

		for (int i = 0; i < evenNumbers.size(); i++) {
			if (evenNumbers.get(i) % 5 == 0) {
				evenNumbers.remove(i);
			}
		}
		System.out.println(evenNumbers);
	}
}
