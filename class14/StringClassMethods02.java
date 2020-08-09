package com.syntax.class14;

public class StringClassMethods02 {
	public static void main(String[] args) {

		System.out.println("--- .contains() Method");
		String txt = "Hi, Good afternoon";

		boolean txtContains1 = txt.contains("afternoon");
		System.out.println(txtContains1);

		boolean txtContains2 = txt.contains(" ");
		System.out.println(txtContains2);

		boolean txtContains3 = txt.contains("Hi, Hello");
		System.out.println(txtContains3);

		boolean txtContains4 = txt.contains("after");
		System.out.println(txtContains4);

		System.out.println();

		System.out.println("--- .startsWith() Method ---");
		String fruit = " WaterMelon";
		boolean startWith1 = fruit.startsWith("W");
		System.out.println(startWith1);
		boolean startWith2 = fruit.startsWith(" ");
		System.out.println(startWith2);

		System.out.println();

		System.out.println("--- .endsWith() Method ---");
		String laptop = "Asus Zenbook";
		boolean endWith1 = laptop.endsWith("book");
		System.out.println(endWith1);
		boolean endWith2 = laptop.endsWith("o");
		System.out.println(endWith2);
	}
}
