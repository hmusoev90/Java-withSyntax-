package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Black"));
		life.put(2, new Zebra("Zebra", "White&Black"));
		life.put(3, new Monkey("Monkey", "Brown"));
		System.out.println(life);

		System.out.println("1. - - - -  Using EntrySet  - - - - ");
		Set<Entry<Integer, Animal>> entries = life.entrySet();

		for (Entry<Integer, Animal> entry : entries) {
			entry.getValue().eat();
			entry.getValue().sleep();
			System.out.println("----------");
		}
		System.out.println("2.---------   Using values()   ---------");
		Collection<Animal> values = life.values();
		for (Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("-----------");
		}

		System.out.println("3. ------ Using keySet() -----------");

		Set<Integer> keys = life.keySet();
		for (Integer key : keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------------");
		}

		System.out.println("4. --------- Using Iterator -------------");
		 Iterator<Animal> animals=life.values().iterator();
		 while(animals.hasNext()) {
			 Animal animal = animals.next();
			 System.out.println(animal.type);
			 System.out.println(animal.color);
			 animal.eat();
			 animal.sleep();
			 System.out.println("-----------");
		 }
		
	}
}
