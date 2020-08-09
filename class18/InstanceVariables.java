package com.syntax.class18;

public class InstanceVariables {

	String name = "Jane"; // instance variable

	public static void main(String[] args) {

		String name = "Sara"; // local variable
		System.out.println("Local variable: " + name); // Sara will be printed

		// we create an Object or we instantiate a class ---> InstanceVariables
		InstanceVariables obj = new InstanceVariables();
		System.out.println("Instance Variable: " + obj.name); // Jane will be printed

		// let's change value of local variable (name);
		System.out.println("----###--------###----");
		name = "Justin";
		System.out.println("New Value of Locat Variable: " + name);

		// let's change value of instance variable (name);
		obj.name = "Maricella";
		System.out.println("New Value of Instance Variable: " + obj.name);
		
		
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);

	}
}
