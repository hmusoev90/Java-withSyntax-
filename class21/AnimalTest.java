package com.syntax.class21;

public class AnimalTest {

	public static void main(String[] args) {

		// Parent class has access to all variables and methods of its own
		System.out.println(" - - - Parent Class - - - ");
		Animal a = new Animal();
		a.breed = "";
		a.color = "Black&White";
		a.paws = 4;

		a.sleep();
		a.eat();

		System.out.println(" - - - Child Class #1 (Dog) - - - ");
		Dog dog = new Dog();
		dog.breed = "Buldog";
		dog.color = "Black";
		dog.paws = 4;
		dog.tail = true;

		dog.eat();
		dog.bark();

		System.out.println(" - - - Child Class #2 (Cat) - - - ");
		Cat cat = new Cat();
		cat.breed = "Tojiki";
		cat.color = "AlaBala";
		cat.paws = 4;
		cat.tail = true;

		cat.purr();
		cat.sleep();
		cat.eat();

		System.out.println(" - - - Child/Child Class #3 (Kitten) - - - ");

		Kitten kitten = new Kitten();
		kitten.breed = "PiwPiw";
		kitten.color = "Safedak";
		kitten.paws = 4;
		kitten.talk = "MeawMeaw";

		kitten.purr();
		kitten.sleep();
		kitten.eat();

	}
}
