package com.syntax.class24Polymorphism;

public class WebDriver {

	public void open() {
		System.out.println("Openning Browser");
	}
}

class FireWorkDriver extends WebDriver {
	public void open() {
		System.out.println("FireWork Browser Opens");
	}
}

class ChromeDriver extends WebDriver {
	public void open() {
		System.out.println("Chome Browser Opens");
	}
}

class IEDriver extends WebDriver {
	public void open() {
		System.out.println("Internet Explorer Browser Opens");
	}
}
