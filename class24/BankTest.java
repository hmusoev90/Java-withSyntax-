package com.syntax.class24;

public class BankTest {

	public static void main(String[] args) {
		BOFA bofa = new BOFA(900);
		double bofaFee = bofa.chargeFee();
		System.out.println("Fee is "+bofaFee);

		Citi citi = new Citi(1400);
		double citiFee = citi.chargeFee();
		System.out.println("Fee is " + citiFee);
	}
}
