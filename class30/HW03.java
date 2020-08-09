package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

class HW03 {

	/*
	 * Create a class Insurance that will have an attribute as insuranceName and
	 * unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses
	 * Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet
	 * has petType attribute. Create 3 objects of the sub classes and store them in
	 * ArrayList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Insurance> insurance = new ArrayList<>();
		insurance.add(new Car("Root", "Camry"));
		insurance.add(new Pet("Geico", "Dog"));
		insurance.add(new Health("State Farm"));

		System.out.println(" - - With regular For Loop - -");
		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
		}

		System.out.println(" - - With Enhanced For Loop - -");
		for (Insurance txt : insurance) {
			txt.getQuote();
			txt.cancelInsurance();
		}

		System.out.println(" - - With Iterator - - ");
		Iterator<Insurance> it = insurance.iterator();

		while (it.hasNext()) {
			Insurance a = it.next();
			a.getQuote();
			a.cancelInsurance();
		}
	}
}



class Car extends Insurance {
	String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("With " + insuranceName + " insurance you can save %50 for your " + carModel + " car.");
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " insurance is canceled for " + carModel);
	}
}

class Pet extends Insurance {
	String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;

	}

	@Override
	public void getQuote() {
		System.out.println("With " + insuranceName + " insurance you can save %50 for your " + petType);
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " is canceled");
	}
}

class Health extends Insurance {
	Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Safe more with " + insuranceName + " insurance");
	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName + " is canceled");
	}
}
