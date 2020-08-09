package com.syntax.class24Polymorphism;

public class Store {

	String departmentName, location;

	public Store(String departmentName, String location) {
		this.departmentName = departmentName;
		this.location = location;
	}

	public void openHours() {
		System.out.println(departmentName + " is open from 10AM - 9PM");
	}

}

class Macys extends Store {
	public Macys(String departmentName, String location) {
		super(departmentName, location);
	}

	@Override
	public void openHours() {
		System.out.println(departmentName + " is open from 8AM - 6PM");
	}
}

class Starbucks extends Store {

	public Starbucks(String departmentName, String location) {
		super(departmentName, location);
	}

	public void openHours() {
		System.out.println(departmentName + " is open only on weekdays from 6AM-10PM");
	}

	public void sellDrinks() {
		System.out.println(departmentName + " sells different type of Drinks");
	}
}

class theFix extends Store {
	public theFix(String departmentName, String location) {
		super(departmentName, location);
	}

	@Override
	public void openHours() {
		System.out.println(departmentName + " is open from 11AM-7PM, except Sundays from 12PM-6PM");
	}
}
