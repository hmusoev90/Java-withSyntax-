package com.syntax.class21;

public class Constructors {

	String word;

	public Constructors() {
		System.out.println("I am a non argument constructor");
	}

	public Constructors(String word) {
		this(12); // used to call constructor, depending on argument
		this.word = word;
		System.out.println("I am a constructor with str=" + word);
	}

	public Constructors(int num) {
		System.out.println("I am constructor with 1 paramentr " + num);
	}

	public static void main(String[] args) {

		Constructors obj = new Constructors("Java"); // goes to constructor and prints all codes inside the constructor
		System.out.println(obj.word); // prints word value
	}
}
