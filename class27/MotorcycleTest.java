package com.syntax.class27;

public class MotorcycleTest {

	public static void main(String[] args) {

		System.out.println(" ");
		Motorcycle m = new Bike();
		m.drive();
		m.breaking();

		System.out.println(" ");
		Drivable d = new Bike();
		d.drive();
		d.breaking();
		
		System.out.println(" ");
		
		Vehicle v = new Bike();
		v.operateVehicle();
		
	}
}
