package com.syntax.class30;

public abstract class Insurance {
	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	abstract void getQuote();

	abstract void cancelInsurance();
}