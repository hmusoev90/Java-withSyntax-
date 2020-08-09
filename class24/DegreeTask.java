package com.syntax.class24;

/*Create a class 'Degree' having a method 'getPrerequisite' 
 *that prints ""To get a degree you need high school diploma"". 
 *Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. 
 *In Masters class override method 'getPrerequisite'.
 *Call the method by creating an object of each of the three classes.
 * 
 */

public class DegreeTask {

	void getPrerequisite() {
		System.out.println("\"To get a degree you need high school diploma.\"");
	}
}

class Bachelors extends DegreeTask {
	@Override
	void getPrerequisite() {
		System.out.println("\"To get Bahelor degree you need associate degree\"");
	}
}

class Masters extends DegreeTask {
	@Override
	void getPrerequisite() {
		System.out.println("\"To get Master degree you need Bachelor degree\"");
	}
}
