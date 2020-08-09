package com.syntax.class20;

public class ConstructorHW {

	/*
	 * Write a program that will have 4 different access levels of constructors and
	 * create 3 objects of this class: 1 - inside same class; 2 - from outside the
	 * class; 3 - from different class inside different package and observe result.
	 * Write program that have static constructor and observe result.
	 */
	public String name, lastName, company;

	protected int age;
	double salary;
	private long snn;

	public ConstructorHW() {

	}

	ConstructorHW(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	protected ConstructorHW(double salary) {
		this.salary=salary;
	}

	private ConstructorHW(String s, int a) {

	}

	void displayInfo() {
		System.out.println(name + " " + lastName + " works at " + company + ". He is " + age
				+ " years old.He is salary is " + salary);
	}

}
