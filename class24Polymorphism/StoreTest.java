package com.syntax.class24Polymorphism;

public class StoreTest {

	public static void main(String[] args) {
		
	Store[] store = {new Macys("Macys", "San Antonio"), new Starbucks("StarBucks", "Dallas"), new theFix("The Fix", "North Star Mall")};
	
	for (Store st: store) {
		st.openHours();
	}
	}
}
