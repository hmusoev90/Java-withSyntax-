package com.syntax.class18;

/*
 * Create a Class called Students
	Create three  variables  studentName , studentID  and  numberOfStudents
	Create three objects of the Students Class 
	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	Print out  total number of students
 */
public class HW01 {

	String studentName;
	int studentId;
	static int numberOfStudents;

	public static void main(String[] args) {

		HW01 student1 = new HW01();
		student1.studentName = "John Connor";
		student1.studentId = 231032;

		numberOfStudents++;

		HW01 student2 = new HW01();
		student2.studentName = "Murod Jonibekov";
		student2.studentId = 243039;

		numberOfStudents++;

		HW01 student3 = new HW01();
		student3.studentName = "John Smith";
		student3.studentId = 123912;

		numberOfStudents++;

		System.out.println(numberOfStudents);
	}
}
