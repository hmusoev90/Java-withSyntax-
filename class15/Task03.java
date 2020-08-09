package com.syntax.class15;

public class Task03 {

	public static void main(String[] args) {
		
		/*You have a String a=“Is it saturday? 
		 * Is it raining? 
		 * Do we have a Java Class today?” 
		 * How would you find out how many 
		 * sentences are in that String?
		 * 
		 */
		String txt = "Is it Saturday? Is it raining? Do we have a Java Class Today?";
		
		String[] array1 = txt.split(" ");
		System.out.println("There is "+array1.length+" Words");
		
		String[] array2 = txt.split("[?]");
		System.out.println("There is "+array2.length+" sentences");
	}
}
