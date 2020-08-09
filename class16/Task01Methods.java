package com.syntax.class16;

public class Task01Methods {

	/* 1. Create a method that will take 2 parameters as 
	 * a numbers and prints which number is larger.

	2. Create a method that will take a number and prints 
	whether the number is even or odd.

	3. Create a method that will print whether given 
	String is palindrome or not.

	4. Create a method that will say Hello in different 
	language based on the country that will passed when method is executed.
	 */
	
	void max (int a, int b) {
		if (a>b) {
			System.out.println(a); 
		}
		else
			System.out.println(b);
	}
	
	void evenOdd (int a) {
		System.out.println((a%2==0)?"Even":"Odd");
	}
	
	void Palindrome(String txt) {
		String s = "";
		for (int i=txt.length()-1; i>=0;i--) {
			s+=txt.charAt(i);
		}
		System.out.println((s.equals(txt)?"Palindrome":"Not Palindrome"));
	}
	
	void Hello(String txt) {
		String hello = "";
		if (txt.equals("USA")) {
			hello = "Hello";
		}
		else if (txt.equals("Russia")) {
			hello = "Privet";
		}
		else if (txt.equals("Mexico")) {
			hello = "Spanish";
		}
		else 
			hello = "Hi";
		System.out.println(hello);
	}
}
