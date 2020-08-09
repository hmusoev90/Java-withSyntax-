package com.syntax.class24;

public class CreditCardTest {

	public static void main(String[] args) {
		CrediCardTask cc = new CrediCardTask();
		double fee = cc.interestRate(900);
		System.out.println("Credit Card fee " + fee);

		Visa visa = new Visa();
		double fee1 = visa.interestRate(900);
		System.out.println("Visa fee " + fee1);

		AX ax = new AX();
		double fee2 = ax.interesRate(900);
		System.out.println("AX fee " + fee2);
	}
}
