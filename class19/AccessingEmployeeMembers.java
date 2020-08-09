package com.syntax.class19;

public class AccessingEmployeeMembers {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "John";
		emp.lastName = "Connor";
		emp.age = 28;
		emp.salary = 120_000;
		emp.company = "DWE Technology Services LLC";
		// emp.ssn --> is not available, since ssn is private
		emp.displayAge();
		emp.displayName();
		emp.displaySalary();
		emp.displayCompany();
		// emp.displaySsn(); --> is not available, since displaySsn() method is private
	}
}
