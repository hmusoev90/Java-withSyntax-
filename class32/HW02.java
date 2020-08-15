package com.syntax.class32;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Create a Person class with following private fields: name, lastName, age, salary. 
 * Variables should be initialized through constructor.
 * Inside the class also create a method to print user details.
 * In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
 * 
 */
public class HW02 {
public static void main(String[] args) {
	
	Map<Integer, Person> person = new TreeMap<>();
	person.put(5, new Person("John", "Wick", 25, 50_000));
	person.put(2, new Person("James", "Cameroon", 75, 120_000_000));
	person.put(4, new Person("Jim", "Kerry", 64, 350_000));
	person.put(1, new Person("Hunter", "Musoev", 30, 65_000));
	person.put(3, new Person("Taalaibek", "", 34, 120_000));
	
	
	Set<Entry<Integer,Person>> entries = person.entrySet();
	for (Entry<Integer, Person> entry : entries) {
		Integer key = entry.getKey();
		Person value = entry.getValue();
		System.out.print(key+" : ");
		value.displayInfo();
		System.out.println("\n-------------");
	}
	
	
}
}

class Person{
	private String name, lastName;
	private int age;
	private double salary;
	Person(String name, String lastName, int age, double salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	
	void displayInfo() {
		System.out.println(name+" "+lastName+" "+age+" years old "+".Salary $"+salary);
	}
}
