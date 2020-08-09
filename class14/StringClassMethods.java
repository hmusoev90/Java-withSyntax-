package com.syntax.class14;

public class StringClassMethods {
	public static void main(String[] args) {

		String txt = "Hello World."; // 1st way of declaring String
		String txt1 = new String(); // 2nd way of declaring String
		txt1 = "Hi, how are you?";

		System.out.println("---.toUppeCase() Method ---");
		String newTxt = txt.toUpperCase();
		System.out.println(newTxt);

		System.out.println("--- .toLowerCase() Method");
		String newTxt1 = txt1.toLowerCase();
		System.out.println(newTxt1);

		System.out.println("--- .concat() Method ---");
		String newTxt2 = txt.concat(txt1); // concatinates txt1 and txt2, simply joins them
		System.out.println(newTxt2);

		System.out.println("--- .isEmpty() Method ---");
		System.out.println(txt.isEmpty());// return boolean value true/false

		System.out.println("--- .trim() Method ---");
		String tree = " Apple Tree";
		String car = "   Toyota Camry 2015   ";
		System.out.println(tree.trim()); // delete's spaces before and after txt (middle spaces not included)
		System.out.println(car.trim());

	}
}
