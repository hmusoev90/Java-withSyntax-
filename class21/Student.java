package com.syntax.class21;

public class Student {

	/*
	 * Write a Student class that have instance variables name and address. Create a
	 * constructor that will initialize those variables. Print name & address of
	 * given student using displayInfo method.
	 */
	String name, address;

	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void displayInfo() {
		System.out.println(name + " lives in " + address);
	}

	public static void main(String[] args) {
		Student obj = new Student("Adam", "San Antonio, TX");
		obj.displayInfo();
	}
}
