package com.syntax.class02;

public class Variables {
public static void main(String[] args) {
	
	
	/*  1.Create a Java Program and name it as Variables.
	 *  In your program create create variables with 
	 *  following names and assign them: 
	 *  name 
	 *  lastName 
	 *  grade
	 *  city 
	 *  phoneNumber.
	 * 2.Change student's city, state, phone number and grade.
	 * And print those variables.
	 */
	
	
	
	String name ="John";
	String lastName = "Vitviki";
	String grade = "A+";
	String city = "San Antonio";
	String state = "TX";
	int phoneNumb = 210_000_0203;
	
	// re-assigning city, state, grade and phoneNumb
	city = "Oklahoma City";
	state = "Ok";
	grade ="A";
	phoneNumb = 212_023_1245;
	
	System.out.println("Name: "+name);
	System.out.println("LastName: "+lastName);
	System.out.println("Grade: "+grade);
	System.out.println("State: "+state);
	System.out.println("Phone Number: "+phoneNumb);
	
	
}
}
