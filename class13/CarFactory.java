package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Grey";
		car1.year = 2015;
		car1.drive();

		System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year);
		System.out.println();
		
		Car car2 = new Car();
		car2.make = "Nissan";
		car2.model = "Altima SV";
		car2.color = "Silver";
		car2.year = 2013;
		car2.reverse();
		System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + car2.year);
		System.out.println();
		
		Car car3 = new Car();
		car3.make = "Toyota";
		car2.model = "Corolla";
		car3.color = "Gold";
		car3.year = 2009;
		car3.transportPeople();
		System.out.println(car3.make + " " + car3.model + " " + car3.color + " " + car3.year);

		Car car4 = new Car();
		car4.make = "LADA";
		car4.model = "07";
		car4.color = "White";
		car4.year = 2020;
		System.out.println(car4.make + " " + car4.model + " " + car4.color + " " + car4.year);

	}
}
