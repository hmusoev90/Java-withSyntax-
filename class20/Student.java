package com.syntax.class20;

public class Student {

	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name.
	 * 
	 */
	String name;
	int maths, science, computer;

	Student(String studentName, int mathsGrade, int scienceGrade, int computerGrade) {
		name = studentName;
		maths = mathsGrade;
		science = scienceGrade;
		computer = computerGrade;
	}

	void average() {
		System.out.println(name + " " + (maths + science + computer) / 3);
	}
}
