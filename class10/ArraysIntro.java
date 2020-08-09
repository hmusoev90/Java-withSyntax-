package com.syntax.class10;

public class ArraysIntro {
	public static void main(String[] args) {
		
 // Some real examples, like bringing 
//tea cups in one tray(array) to guests.

	int num1= 10;
	int num2= 15;
	int num3 = 20;
	int num4 = 25;
	
	// Declaring array which has 4 elements
	int[] numbers = new int[4];
	numbers[0] =15;
	numbers[1] =17;
	numbers[2] =-7;
	numbers[3] =84;
	System.out.println(numbers);
	
	//Just declaring, not initializing
	String[] carArray; // preferred way
	String carArray1[]; // works but not preferred
	carArray = new String [3];
	
	carArray[0] = "BMW";
	carArray[1] = "Toyota";
	carArray[2] = "Honda";
	// carArray[3]="Testa"; RunTime error
	
	}	
}
