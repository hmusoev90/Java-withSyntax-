package com.syntax.class30;

public class HW04 {

	/*
	 * Create a Card class that will have implemented and unimplemented methods and
	 * a constructor that will initializes credit card type. Create 3 subclasses of
	 * a Card card. Create 3 objects of different card and store them into
	 * LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 * 
	 */
}

abstract class Card {
	String card;

	Card(String card) {
		this.card = card;
	}

	public void transaction() {
		System.out.println(card + "Transaction is approved.");
	}

	public abstract void cancelTransaction();
}

class Visa extends Card {
	Visa(String card) {
		super(card);
	}

	@Override
	public void cancelTransaction() {
		System.out.println(card + " card transaction is canceled.");
	}
}

class MasterCard extends Card {
	MasterCard(String card) {
		super(card);
	}

	@Override
	public void cancelTransaction() {
		System.out.println(card + " card transaction is canceled.");
	}
}

class CitiCard extends Card {
	CitiCard(String card) {
		super(card);
	}

	@Override
	public void cancelTransaction() {
		System.out.println(card + " card transaction is canceled.");
	}
}