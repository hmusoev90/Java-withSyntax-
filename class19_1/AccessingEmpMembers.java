package com.syntax.class19_1;

import com.syntax.class19.Employee;

public class AccessingEmpMembers {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.name = "Murod";
	emp.lastName = "Safarov";
	//emp.age --> is not available, since age is in another Package
	//emp.salary --> is not available, since salary (default) is in another Package
	//emp.ssn --> is not available, since ssn is in differen class and package
	
}
}
