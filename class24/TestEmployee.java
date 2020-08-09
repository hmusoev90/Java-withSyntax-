package com.syntax.class24;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 110_000;
		emp.getPaid();

		Contractor ct = new Contractor();
		ct.hourlyRate = 50;
		ct.getPaid();

		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 120_000;
		ft.getPaid();
	}
}
