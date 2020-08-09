package com.syntax.class27;

public class BankTest {

	public static void main(String[] args) {

		System.out.println("- - - Object of Bank type - - -");
		Bank bank1 = new Bofa();
		bank1.deposit();
		bank1.withdraw();
		bank1.trust();
		System.out.println();

		System.out.println(" - - - Object of Trustable type - - -");

		Trustable chase1 = new Chase();
		chase1.trust();
		// chase1.deposit(); -->CE: it's not declared in Trustable interface
		System.out.println();

		System.out.println(" - - - Object of the Investments type - - -");
		Investments bank2 = new Bofa();
		bank2.doInvestments();

	}
}
