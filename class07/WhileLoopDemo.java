package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {

		int time = 10;
		
		//Code executes one time
		if (time<12){
			System.out.println("Good morning");
		}
		
		//Code executes infinitely
//		while(time<12) {
//			System.out.println("Good morning");
//		}
		
		//Code will not execute
		while (time>12) {
			System.out.println("Good morning");
		}
		
		// Printing numbers from 1 to 50 (included)
		System.out.println("Printing numbers from 1 to 50 (included)");
		int a = 1;
		while (a<=50) {
			System.out.print(a+" ");
			a++;
		}
		
		// Printing numbers from 20 to 30 (included)
				System.out.println("Printing numbers from 20 to 30 (included)");
				int b = 20;
				while (b<=30) {
					System.out.print(b+" ");
					b++;
				}
				
		// Printing numbers from 20 to 30 (included)
				System.out.println("Printing numbers from 20 to 30 (included)");
				int c = 10;
				while (c>=1) {
					System.out.print(c+" ");
					c--;
				}				
				
		
		
	}
}
