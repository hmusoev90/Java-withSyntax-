package com.syntax.class28;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setSalary(9000);
		double salary = emp.getSalary();
		System.out.println("Salary " + salary);

		emp.setAge(14);
		System.out.println("Age " + emp.getAge());
	}
}
