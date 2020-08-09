package com.syntax.class26;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle lambo = new Lamborgini("ABCD123YZ123");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();

		System.out.println(" - - 2nd Object - - -");

		Car car = new Lamborgini("123AZL3EJZY");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();

		int total = car.totalVehicles;
		System.out.println("Total cars created: " + total);
	}
}
