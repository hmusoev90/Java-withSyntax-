package com.syntax.class09;

public class NestedLoopExample {
	public static void main(String[] args) {

		// Let's print clock counting
		// 0:00
		// 0:01
		// 0:02
		// .....
		// .....
		// 23:58
		// 23:59

		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m <= 59; m++) {
				if (m<10)
				System.out.println(h + ":0" + m);
				else
					System.out.println(h + ":" + m);
			}
		}
	}
}
