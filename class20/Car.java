package com.syntax.class20;

public class Car {

	public static String make;
	protected String model;
	int year;
	private double price;

	public void displayInfo() {
		System.out.println("We build " + year + " " + make + " " + model + " for price $" + price);
	}

	public static void main(String[] args) {

		Car car = new Car();
		/*
		 * Car --> class name car --> reference variable new --> keyword Car();
		 * -->calling Constructor --> block of code that initialize the obj
		 */
		make = "Toyota";
		car.model = "Camry SE";
		car.year = 2015;
		
		car.displayInfo();
	}

}
