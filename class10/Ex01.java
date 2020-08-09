package com.syntax.class10;

public class Ex01 {
public static void main(String[] args) {
	// Print the following Shape
	// $$$$
	// $  $
	// $  $
	// $  $
	// $$$$
	
	for (int r = 1; r<=5; r++) { //The outer loop controls the rows
		for (int c=1; c<=4; c++) {// The inner loop controls the columns
			
			if (r==1 || r==5) { // 1st or last row printing everything
				System.out.print("$");
			} else { // in the other rows
				if (c==1 || c==4) { // 1st or last column print $
					System.out.print("$");
				}
				else { // in other columns print just Space " "
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}
}
