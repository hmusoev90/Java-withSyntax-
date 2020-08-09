package com.syntax.class04;

public class NestedIfTask {
	public static void main(String[] args) {
		
	boolean diploma = false;
	boolean degree = true;
	double gpa = 3.4;

	if (diploma) {
		System.out.println("Congrats.");
	} else {
		System.out.println("You need to get degree.");
		if (degree) {
			if (gpa >= 3.5) {
				System.out.println("You're eligible for scholarship.");
			} else {
				System.out.println("Sorry, study harder.");
			}
		}
	}
}
}

