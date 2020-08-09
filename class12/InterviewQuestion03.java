package com.syntax.class12;

public class InterviewQuestion03 {
public static void main(String[] args) {
	//3.Write a Java Program to print the first 10 numbers of Fibonacci series.
	
	int a=1;
	int b=1;
	int c=0;
	
	for (int i=1; i<=10; i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
