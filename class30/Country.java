package com.syntax.class30;

public abstract class Country {

	public String name;

	public Country(String name) {
		this.name = name;
	}

	public abstract void election();
}

class USA extends Country {
	public USA(String name) {
		super(name);
	}

	@Override
	public void election() {
		System.out.println(name + " holds presedential election every 4 years");
	}
}

class Tajikistan extends Country {

	public Tajikistan(String name) {
		super(name);
	}

	@Override
	public void election() {
		System.out.println(name + " holds presedential election every 7 years");
	}
}

class Canada extends Country {

	@Override
	public void election() {
		System.out.println(name + " holds electin whenever they decide so");
	}

	public Canada(String name) {
		super(name);
	}
}
