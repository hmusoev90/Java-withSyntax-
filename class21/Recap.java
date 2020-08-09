package com.syntax.class21;

public class Recap {

	public String fruit;
	public String kebab;
	public String fish;

	public Recap(String fruit, String kebab, String fish) {
		this.fruit = fruit;
		this.kebab = kebab;
		this.fish = fish;

	}
	
	public  void displayMenu() {
		System.out.println("Today on our menu we "+kebab+" "+fish+" "+fruit);
	}
}


