package com.syntax.class10;

public class ArraysIntro02 {
public static void main(String[] args) {
	
	String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
	// weekdays[5] = "Saturda"; // runtime error
	
	double[] balances= {1000, 23.50, 123};
	double total = balances[0]+balances[1]+balances[2];
	System.out.println("Total balance: "+total);
}
}
