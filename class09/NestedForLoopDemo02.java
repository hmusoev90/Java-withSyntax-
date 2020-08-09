package com.syntax.class09;

public class NestedForLoopDemo02 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("I'm outer loop");

			for (int j = 1; j <= 3; j++) {
				System.out.println("i=" + i + " AND j=" + j);
			}
		}
	}
}
