package com.syntax.class21;

public class Book {

	/*
	 * Write program as a Book class that will have instance variables and 2
	 * Constructors. While creating an object make sure: Instance variables are
	 * being initialized. Both Constructors are being executed
	 * 
	 */

	String bookName1, bookName2;

	Book(String bookName1, String bookName2) {
		this(1);
		this.bookName1 = bookName1;
		this.bookName2 = bookName2;
		System.out.printf("I have finished %s now I'm reading %s\n", bookName1, bookName2);
	}

	Book(int a) {
		System.out.println("I am constructor #2");
	}

	public static void main(String[] args) {

		Book obj = new Book("Harry Potter", " Billionare in Bablyon");

	}
}
