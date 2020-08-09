package com.syntax.class15;

public class StringClassMethod02 {
	public static void main(String[] args) {

		String txt = "Today's weather is Cloudy.";
	
		String[] array = txt.split("d");
		System.out.println(array.length);
		
		for (String text: array) {
			System.out.println(text);
		}
	}
}
