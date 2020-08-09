package com.syntax.class04;

public class CompleteQuiz {
	public static void main(String[] args) {
		
		boolean iscompleted = true;
		int score = 82;
		
		if (iscompleted) {
			//Let's check the score
			if (score>=90) {
				System.out.println("A, geat job!");
			}
			else if (score>=80) {
				System.out.println("B, Well done!");
			}
			else if (score>=70) {
				System.out.println("C, Just passed!");
			}
			else {
				System.out.println("F, you failed!");
			}
		}
		else {
			System.out.println("Please finish your quiz!");
		}
	}
}
