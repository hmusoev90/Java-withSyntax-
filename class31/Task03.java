package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task03 {

	/*
	 * Create a Set collection that will hold Objects of Student Type. In this set
	 * we do not care about the insertion order. Each student object should have
	 * name and studentID. Display name of each student.
	 * 
	 */
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();
		students.add(new Student("Elizabeth", "STD0001"));
		students.add(new Student("John", "STD0005"));
		students.add(new Student("Jimmy", "STD0000"));
		Iterator<Student> itStudents = students.iterator();
		while (itStudents.hasNext()) {
			String studentName = itStudents.next().name;
			System.out.println(studentName);
		}
	}
}

class Student {
	String studentID;
	String name;

	Student(String name, String studentID) {
		this.name = name;
		this.studentID = studentID;
	}
}