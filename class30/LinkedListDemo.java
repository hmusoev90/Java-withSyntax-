package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();

		food.add("Oshi tj");
		food.add("Chrispy Chicken");
		food.add("Pizza");
		food.add("Egg rolls");
		food.add("tacos");

		System.out.println(food.get(2));
		System.out.println(food);

		LinkedList<String> deserts = new LinkedList<String>();
		deserts.add("Cheese cake");
		deserts.add("ice cream");
		deserts.add("Baklava");
		food.addAll(deserts);
		System.out.println(food);
		food.remove("tacos");
		System.out.println(food);

		food.set(3, "Sandwich");
		System.out.println(food);

		for (String f : food) {
			System.out.print(f + " ");
		}
		System.out.println();
		Iterator<String> foodIterator = food.iterator();

		while (foodIterator.hasNext()) {
			String fooood = foodIterator.next();
			if (fooood.equals("Pizza")) {
				foodIterator.remove();
			}
		}
		System.out.println(food);

	}
}
