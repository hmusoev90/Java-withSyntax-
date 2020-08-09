package com.syntax.class18;

public class TaskClass {
	public static void main(String[] args) {

		TaskEmployee employee1 = new TaskEmployee();
		employee1.eID = 123445;
		employee1.salary = 150_000;

		TaskEmployee employee2 = new TaskEmployee();
		employee2.eID = 431340;
		employee2.salary = 110_000;

		employee1.displayInfo();
		employee2.displayInfo();

	}
}
