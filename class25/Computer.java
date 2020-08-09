package com.syntax.class25;

public class Computer {

	String brandName;
	double CPU;

	Computer(String brandName, double CPU) {
		this.brandName = brandName;
		this.CPU = CPU;
	}

	public void laptopInfo() {
		System.out.println(brandName + " with CPU " + CPU + " GHz.");
	}
}

class Apple extends Computer {
	Apple(String brandName, double CPU) {
		super(brandName, CPU);
	}

	@Override
	public void laptopInfo() {
		System.out.println(brandName + " with CPU " + CPU + " GHz.");
	}

	public void Macbook() {
		System.out.println("Macbooks are good at coding");
	}
}

class Lenovo extends Computer {
	Lenovo(String brandName, double CPU) {
		super(brandName, CPU);
	}

	@Override
	public void laptopInfo() {
		System.out.println(brandName + " with CPU " + CPU + " GHz.");
	}

	public void thinkPad() {
		System.out.println("ThinkPads are one of the most Lenovo sold laptops.");
	}
}

class HP extends Computer {
	HP(String brandName, double CPU) {
		super(brandName, CPU);
	}

	@Override
	public void laptopInfo() {
		System.out.println(brandName + " with CPU " + CPU + " GHz.");
	}

	public void hpInfo() {
		System.out.println("Nowaday HP doesn't sell too much laptops :)");
	}
}

class Dell extends Computer {
	Dell(String brandName, double CPU) {
		super(brandName, CPU);
	}

	@Override
	public void laptopInfo() {
		System.out.println(brandName + " with CPU " + CPU + " GHz.");
	}

}