package com.syntax.class10;

public class ArraysTask01 {
	public static void main(String[] args) {

		/* 1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 *  Then print a grade B (use 2 different ways of creating an array).
		 *	
		 * 2.Create an array of names and store all names of your group. 
		 *  Then print your name from that array. (use 2 different ways of creating an array).
		 *
		 * 3.Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 * 
		 */
		char[] charArrays = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(charArrays[1]);
		System.out.println("------------------");

		String[] group = new String[5];
		group[0] = "John";
		group[1] = "Elion";
		group[2] = "Andrei";
		group[3] = "Hunter";
		group[4] = "Ivan";
		System.out.println(group[3]);
		System.out.println("--------------");
		
		String[] words = {"Java", "Saturday", "day", "coding","is"};
		String sentence = words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		System.out.println(sentence);
		
		int[] nums = new int[2];
		System.out.println(nums[1]);
	}
}
