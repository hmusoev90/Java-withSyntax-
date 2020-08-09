package com.syntax.class10;

import java.util.Scanner;

public class BreakTime {
public static void main(String[] args) {
	
	System.out.println("Break Time?");
	Scanner input= new Scanner(System.in);
	String answer = input.next();
	
	while(!answer.equalsIgnoreCase("yes")) {
		System.out.println("Break Time?");
		answer = input.next();
	}
	System.out.println("Yeahh, finally we got our break .");
}
}
