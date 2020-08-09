package com.syntax.class24;

public class Bank {

	double money, fee;

	public Bank(double money) {
		this.money = money;
	}

	 double chargeFee() {
		if (money < 1000) {
			fee = money * 0.01;
		} else {
			fee = 0;
		}
		return fee;
	}
}

class BOFA extends Bank {

	public BOFA(double money) {
		super(money);
	}

	double chargeFee() {
		if (money < 1000) {
			fee = money * 0.2;
		}
		else {
			fee=0;
		}
		return fee;
	}
}

class Citi extends Bank{
	
	public Citi(double money) {
		super(money);
	}
}
