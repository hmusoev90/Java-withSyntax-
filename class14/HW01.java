package com.syntax.class14;

public class HW01 {
public static void main(String[] args) {

	// Print String in reverse order
	String txt ="Hello World";
	
	for (int i=txt.length()-1; i>=0; i--) {
		System.out.print(txt.charAt(i));
	}
}
}
