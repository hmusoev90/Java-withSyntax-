package com.syntax.class18;

public class House {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Boris";
		cat1.age = 4;
		cat1.color = "Brown";

		Cat cat2 = new Cat();
		cat2.name = "PishPish";
		cat2.age = 8;
		cat2.color = "Black&White";
		
		Cat.mustache = false; // Since mustache is static, it's gonna affect to all other Cats(objects)
		cat1.displayCat();
		cat2.displayCat();
		
		System.out.println();
		
		cat1.dislayCommonFeatures();
		cat2.dislayCommonFeatures();
		
	}
}
