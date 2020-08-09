package com.syntax.class18;

public class FamilyDemo {
	public static void main(String[] args) {

		ConnorMember.lastName = "Connor";
		ConnorMember member1 = new ConnorMember();
		member1.firstName = "John";
		member1.age = 42;

		ConnorMember member2 = new ConnorMember();
		member2.firstName = "Castro";
		member2.age = 34;

		member1.printInfo();
		member2.printInfo();

		ConnorMember baby = new ConnorMember();
		baby.firstName = "Sara";
		baby.age = 1;
		baby.printInfo();

	}
}
