package com.syntax.class27;

abstract class Mortgage {

	public abstract void giveMortgage();
}

public interface Trustable {
	void trust();
}

interface Investments {
	void doInvestments();
}

interface Bank extends Trustable {
	void deposit();
	void withdraw();

}

class Bofa implements Bank, Investments {

	public void deposit() {
		System.out.println("Deposit money with Bofa");
	}

	public void withdraw() {
		System.out.println("You can Withdraw $1000.0 in a day");
	}

	public void trust() {
		System.out.println("If you're more than a year we us, you're trustable customer");
	}
	public void doInvestments() {
		System.out.println("Do investments with Bofa.");
	}
}

class Chase extends Mortgage implements Bank, Investments {
	public void deposit() {
		System.out.println("No need for deposit.");
	}

	public void withdraw() {
		System.out.println("Withdraw as much as you have in your balance))");
	}

	public void trust() {
		System.out.println("If you're more than a month we us, you're trustable customer");
	}

	public void giveMortgage() {
		System.out.println("Mortgage with Chase.");
	}
	
	public void doInvestments() {
		System.out.println("Do investments with Chase.");
	}

}
