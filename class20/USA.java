package com.syntax.class20;

public class USA {

	public static String country;
	String state, capital;

	USA(String state, String capital) {
		this.state = state;
		this.capital = capital;
	}

	public void display() {
		System.out.println("State is " + state + " and it's capital is " + capital);
	}
}
