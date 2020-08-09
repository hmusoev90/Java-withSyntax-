package com.syntax.class18;

public class Cat {

	// instance variables
	String name, color;
	int age;

	// Static variables
	static int paws = 4;
	static boolean mustache = true;
	static boolean tail = true;

	void displayCat() {
		System.out.println("Cat name is " + name + " and this cat is " + color + " and it's " + age + " years old");
	}

	void dislayCommonFeatures() {
		System.out.println(name + " has " + paws + " paws and " + " +tail =" + tail + " and mustache =" + mustache);
	}
}
