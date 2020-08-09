package com.syntax.class27;

public interface Drivable { // interface is colletion of public abstract methods and public static final
							// variables

	public static final String DRIVE = "Drive safe";

	public abstract void drive();

	void breaking(); // by default Java adds public abstract
}

abstract class Motorcycle extends Vehicle implements Drivable {

	public void drive() {
		System.out.println("Motorcycle is driving");
	}
}

class Bike extends Motorcycle {
	public void breaking() {
		System.out.println("Bike can break");
	}
}

class Vehicle {
	public void operateVehicle() {
		System.out.println("To operate any vehicle get driver lisence.");
	}
}