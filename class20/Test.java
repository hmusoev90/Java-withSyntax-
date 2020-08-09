package com.syntax.class20;

public class Test {
	public static void main(String[] args) {
		CallingConstructor test1 = new CallingConstructor();

		CallingConstructor test2 = new CallingConstructor("Hello");

		Student test3 = new Student("John", 85, 100, 90);
		test3.average();

		Student test4 = new Student("Hunter", 70, 65, 50);
		test4.average();

		Student test5 = new Student("Connor", 55, 30, 20);
		test5.average();
	}
}
