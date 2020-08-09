package com.syntax.class22Task;

public class Employee {

	static String company;
	double salary;

	void work() {
		System.out.println("Let's start the work");
	}

	void getPaid() {
		System.out.println(company+" pays to its employees at least $"+salary);
	}
}
