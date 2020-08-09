package com.syntax.class19;

public class Employee {

	static String company; // any class from any package in the project can access
	public String name, lastName; // any class from any package in the project can access
	protected int age; // if class is within same package, it can access 
	double salary; // default // if class is within same package, it can access
	private long ssn; // only it's own class/same can have access to it

	public static void displayCompany() {
		System.out.println("Employee works at " + company);
	}

	public void displayName() {
		System.out.println("Employee name is " + name + " " + lastName);
	}

	protected void displayAge() {
		System.out.println("Employee is " + age + " years old.");
	}

	void displaySalary() {
		System.out.println("Employee salary is " + salary);
	}

	private void displaySsn() {
		System.out.println("Employee SSN is " + ssn);
	}

	public static void main(String[] args) {

		company = "Apple Inc";
		Employee emp = new Employee();
		emp.name = "John";
		emp.lastName = "Wick";
		emp.age = 34;
		emp.salary = 90_000;
		emp.ssn = 123_45_2037;
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySsn();
		
	}
}
