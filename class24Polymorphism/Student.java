package com.syntax.class24Polymorphism;

public class Student {

	public void study() {
		System.out.println("Let's start studying");
	}

	public void sleep() {
		System.out.println("Time to sleep");
	}
}

class SyntaxStudent extends Student {

	public void loveJava() {
		System.out.println("Syntax students like Java");
	}

	@Override
	public void study() {
		System.out.println("Let's study harder");
	}

	@Override
	public void sleep() {
		System.out.println("No time to sleep");
	}
}

class CollegeStudent extends Student {
	public void read() {
		System.out.println("College students read books");
	}

}

class SchoolStudent extends Student {
	public void study() {
		System.out.println("School students doesn't study too hard.");
	}
}
