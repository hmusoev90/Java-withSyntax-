package com.syntax.class18;

/*
 	Create a Class called Employee:
	Create three  variables  eID , salary and set the CEO to “Sumair” 
	Create two objects of the class Employee 
	Set the value of eID, salary for each of the objects
	Print out the eID , salary and  CEO for each of the objects
 */

public class TaskEmployee {
	int eID;
	int salary;
	static String CEO = "Sumair";

	void displayInfo() {
		System.out.println("Employee eID is " + eID + " and salary is $" + salary + " and Company CEO is " + CEO);
	}
}
