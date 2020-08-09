package com.syntax.class24;

/*Create a class CreditCard and define variable balance and interest. 
 *Create an instance method that will calculate interest based on the given balance. 
 *Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
 *Call the method by creating an object of each of the three classes.
 * 
 */

public class CrediCardTask {

	double balance, interest;

	double interestRate(double balance) {
		if (balance < 1500) {
			interest = balance * 0.001;
		} else {
			interest = 0;
		}
		return interest;
	}

}

class Visa extends CrediCardTask {

}

class AX extends CrediCardTask {
	double interesRate(double balance) {
		if (balance < 1000) {
			interest = balance * 0.01;
		} else {
			interest = 0;
		}
		return interest;
	}
}
