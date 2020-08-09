package com.syntax.class12;

public class Recap {
	public static void main(String[] args) {

		String[][] animals = { { "Cat", "Dog", "Cow", "Hen" }, 
				{ "Tiger", "Bear", "Lion" } };
		System.out.println("---- USING FOR LOOP ----");
		for (int i=0; i<animals.length;i++) {
			for (int j=0; j<animals[i].length; j++) {
				System.out.print(animals[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---- USING ENHANCED FOR LOOP");
		for (String[] animal : animals) {
			for (String petAnimals : animal) {
				System.out.print(petAnimals+" ");
			}
			System.out.println();
		}

	}
}
