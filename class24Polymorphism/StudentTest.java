package com.syntax.class24Polymorphism;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println(" - - - Student Class - - - ");
		Student st = new Student();
		st.study();
		st.sleep();

		System.out.println(" - - - SyntaxStudent Class - - - ");
		SyntaxStudent sst = new SyntaxStudent();
		sst.sleep(); // Overriden methods
		sst.study(); // Overriden methods

		System.out.println(" - - - CollegeStudet Class - - - ");

		CollegeStudent cst = new CollegeStudent();
		cst.read();
		cst.study();
		cst.sleep();

		System.out.println(" -- A little bit about Polymorphism - - - ");

		Student st1 = new SyntaxStudent();
		st1.study();// Run-Time Polymorphism --> Method from SyntaxStudent will be executed

		Student st2 = new SchoolStudent();
		st2.study();// Run-Time Polymorphism --> Method from SchoolStudent will be executed
		

	}
}
