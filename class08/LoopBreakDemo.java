package com.syntax.class08;

public class LoopBreakDemo {
	public static void main(String[] args) {

		// We're counting from 1 to 10
		// and we want to stop the loop when reach 4

		System.out.println("----BREAK----");
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				// System.out.println("I am stopping the loop");
				break;
			}
			System.out.println(i);
		}

		System.out.println("----CONTINUE----");
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				// System.out.println("I am not printing 4");
				continue;
			}
			System.out.println(i);
		}
	}
}
