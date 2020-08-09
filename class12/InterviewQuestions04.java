package com.syntax.class12;

import java.util.Arrays;

public class InterviewQuestions04 {
public static void main(String[] args) {
		/*
		 * 4.Write a java program to find the second 
		 * largest number in the array? Maximum and minimum 
		 * number in the array?
		 */
	
	int[] numbers = {1,5,-3,21,53,22,65};
	
	int max = numbers[0];
	int min = numbers[0];
	
	for (int i=0; i<numbers.length;i++) {
		if (max<numbers[i])
			max=numbers[i];
		else if (min>numbers[i])
			min=numbers[i];
	}
	for (int i=0; i<numbers.length; i++) {
		
	}
	System.out.println("Max is "+max);
	System.out.println("Min is "+min);
	
	System.out.println("--By Sorting Method--");
	Arrays.sort(numbers);
	for (int num: numbers) {
		System.out.print(num+" ");
	}
	System.out.println();
	System.out.println("Max is: "+numbers[numbers.length-1]);//Printing largest
	System.out.println("2nd Largest: "+numbers[numbers.length-2]);//Printing 2nd largest
	System.out.println("Smallest: "+numbers[0]);//Printing the smallest
}
}
