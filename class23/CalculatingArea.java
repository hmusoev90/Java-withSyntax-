package com.syntax.class23;

public class CalculatingArea {

	public static String area(int a, int b) {
		return "Area of Rectangle is " + (a * b);
	}

	private static String area(int a) {
		return "Area of Square is " + (a * a);
	}

	public static void main(String[] args) {
		System.out.println(area(2, 5)); // Rectangle
		System.out.println(area(7)); // Square
	}
}
