package com.syntax.class07;

import java.util.Scanner;

public class WhileLoopDemo02 {
public static void main(String[] args) {
	// We want to ask users name 5 times and print Good afternoon ___ 5 times
	
	Scanner input = new Scanner(System.in);
	
	int a=1;
	
	// 1st Way
	while (a<=5) {
		System.out.println("Enter your name, please:");
		String name = input.nextLine();
		System.out.println("Good afternoon "+name);
		a++;
	}
	
	//2nd Way
	int b=1;
		do {
			System.out.println("Enter your name, please:");
			String name1 = input.nextLine();
			System.out.println("Good afternoon "+name1);
			b++;
		}
		while (b<=5);
	
	}
}
