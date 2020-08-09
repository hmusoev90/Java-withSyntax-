package com.syntax.class05;

import java.util.Scanner;

public class ClassTask03 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90  grade=A if the average score >= 70 and <90  grade=B if
		 * the average score>=50 and <70  grade=C if the average score<50  grade=F
		 */

		System.out.println("Enter your quiz, mid term and final scores,please:");
		Scanner input = new Scanner(System.in);

		double quiz = input.nextDouble();
		double mid = input.nextDouble();
		double finalScore = input.nextDouble();

		double average = (quiz + mid + finalScore) / 3;

		if (average >= 90 && average <= 100)
			System.out.println("Perfect, A grade.");
		else if (average >= 70 && average < 90)
			System.out.println("Good, B grade");
		else if (average >= 50 && average < 70)
			System.out.println("Normal, C grade");
		else if (average > 0 && average < 50)
			System.out.println("Bad, F grade");
		else
			System.out.println("Wrong input.");
	}
}
