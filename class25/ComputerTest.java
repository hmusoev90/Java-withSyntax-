package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] computer = { new Apple("Macbook", 2.7), new Lenovo("ThinkPad", 2.3), new HP("EliteBook", 1.7),
				new Dell("Dell XPS 13", 1.8) };

		for (Computer cp : computer) {
			cp.laptopInfo();
			System.out.println(" - - - - - - - ");
		}
	}
}
