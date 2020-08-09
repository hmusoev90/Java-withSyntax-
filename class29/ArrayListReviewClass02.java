package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReviewClass02 {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		Student stu1 = new Student("ST0001", "Donald", "Duck", 65);
		Student stu2 = new Student("ST0002", "James", "Cameroon", 53);

		students.add(stu1);
		students.add(stu2);

		students.add(new Student("ST003", "Aziz", "Mirzoev", 30));
		System.out.println("ArrayList size: " + students.size());

		// There are 3 ways of iterating students elemets
		// 1. Regular For Loop
		// 2. Enhanced for loop
		// 3. Iterator

		System.out.println("-- Regular For Loop --");
		for (int i = 0; i < students.size(); i++) {
			students.get(i).displayInfo();
			System.out.println("-------------------");
		}

		System.out.println("- - - - - - - - - - - -");
		System.out.println("-- Enhanced For Loop --");

		for (Student a : students) {
			a.displayInfo();
			System.out.println("-----------------");
		}

		System.out.println("- - - - - - - - - - - -");
		System.out.println("-- Iterator --");

		// iterator has 3 methods --> hasNext(), next(), remove();
		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			Student a = it.next();
			a.displayInfo();
			System.out.println("--------------");
		}

	}
}
