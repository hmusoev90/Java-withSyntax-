package com.syntax.class29;

public class CollectionsReviewClass {

	// Wrapper Class --> converts primitive data into object
	public static void main(String[] args) {

		// byte-short-int-long-float-double-boolean-char
		// Byte-Short-Integer-Float-Double-Boolean-Character

		/*
		 * boxing --> converting a primitive data into non-primitive boxing auto-boxing
		 */

		/*
		 * unboxing --> converting a non-primitive data type into primitive data type
		 * 
		 */

		Integer i = new Integer(15); // boxing;
		Integer i1 = 45; // auto boxing

		int i2 = i1; // auto unboxing
		int i3 = i1.valueOf(i1); // unboxing

		// We can use any data type in arrays

		Student[] students = new Student[4];

		students[0] = new Student("01","John", "Wick", 45);
		students[1] = new Student("02","Jimmy", "Johns", 35);
		students[2] = new Student("03","Hasan", "Vanli", 41);

		Student stu = new Student("04","Harly", "Davidson", 95);
		students[3] = stu;

	}
}

class Student {

	String stuId, firstName, lastName;
	int age;

	Student(String stuId, String firstName, String lastName, int age) {
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Student ID:" +stuId+"\n First Name & LastName"+firstName+" "+lastName);
		System.out.println("Age: "+age);
	}
}
